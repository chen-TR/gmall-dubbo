package cn.ctr.gamll;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 导入依赖
 *      1. 导入dubbo-starter
 *      2. 导入dubbo其他依赖
 * 2. springboot和dubbo的三种整合方式
 *      1. 导入dubbo-starter,在properties中配置属性，使用@service暴露服务，使用@referenceu引用服务，在main中开启enableDubbo或者在配置中指定scan
 *      2. 导入dubbo-starter,保留xml main中使用@ImportResource()注解导入xml配置文件
 *      3. 使用注解API的形式 @Configuration，@Bean编写配置类， main中使用@EnableDubbo(scanBasePackages="")来扫描组件
 */
@EnableDubbo
@SpringBootApplication
public class BootOrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
    }

}
