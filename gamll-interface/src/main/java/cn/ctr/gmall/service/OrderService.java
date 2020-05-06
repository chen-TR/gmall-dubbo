package cn.ctr.gmall.service;

import cn.ctr.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author 陈天润
 * @version 0.0.1
 * @since 2020/5/5 16:59
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
