package cn.ctr.gmall.service;

import cn.ctr.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author 陈天润
 * @version 0.0.1
 * @since 2020/5/5 16:49
 * 用户服务
 */
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
