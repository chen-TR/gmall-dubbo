package cn.ctr.gamll.service.impl;

import cn.ctr.gmall.bean.UserAddress;
import cn.ctr.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈天润
 * @version 0.0.1
 * @since 2020/5/6 2:55
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 必须写一个有参构造器，传入一个远程的service代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    /**
     * 利用本地存根代码可以进行一些参数校验等的工作，或是先行做一些判断
     * 个人认为这是一个降低服务系统压力，减小不必要的rpc调用的方法
     * 可能可以用来防止某些而已的调用
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("本地存根被调用了....");

        List<UserAddress> userAddressList = new ArrayList<>();
        try{
            if(!StringUtils.isEmpty(userId) && Integer.parseInt(userId)<10000){
                System.out.println("参数校验成功...rpc调用");
                userAddressList = userService.getUserAddressList(userId);
            }else throw new IllegalArgumentException();
        }catch (IllegalArgumentException le){
            System.out.println("参数不匹配");
        }finally {
            return userAddressList;
        }
    }
}
