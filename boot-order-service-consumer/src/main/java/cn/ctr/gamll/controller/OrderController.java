package cn.ctr.gamll.controller;

import cn.ctr.gmall.bean.UserAddress;
import cn.ctr.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 陈天润
 * @version 0.0.1
 * @since 2020/5/5 22:54
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/order/{id}")
    public List<UserAddress> initOrder(@PathVariable("id") String id){
        return orderService.initOrder(id);
    }
}
