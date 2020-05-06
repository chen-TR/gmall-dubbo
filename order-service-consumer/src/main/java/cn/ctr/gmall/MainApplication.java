package cn.ctr.gmall;

import cn.ctr.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author 陈天润
 * @version 0.0.1
 * @since 2020/5/5 18:54
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");

        System.out.println("rpc 调用完成");
        System.in.read();

    }
}
