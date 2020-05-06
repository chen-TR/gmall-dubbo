package cn.ctr.gmall.service.impl;

import cn.ctr.gmall.bean.UserAddress;
import cn.ctr.gmall.service.OrderService;
import cn.ctr.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1. 注册服务提供者
 *      1. 导入dubbo依赖
 *      2.
 * 2. 服务消费者订阅服务提供者的服务地址
 * @author 陈天润
 * @version 0.0.1
 * @since 2020/5/5 17:01
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println(userId);
        // 查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress ua: addressList
             ) {
            System.out.println(ua.getUserAddress());
        }
    }
}
