package cn.ctr.gmall.config;

import cn.ctr.gmall.service.UserService;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

/**
 * @author 陈天润
 * @version 0.0.1
 * @since 2020/5/6 2:21
 */
@Configuration
@PropertySource("classpath:/application.properties") // 可以将多个service中的公共部分抽取出来放到properties中
public class MyDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-service-provider");
        return applicationConfig;
    }

//    @Bean
//    public RegistryConfig registryConfig(){
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setProtocol("zookeeper");
//        registryConfig.setAddress("127.0.0.1:2181");
//        return registryConfig;
//    }

    public ServiceConfig<UserService> userServiceConfig(UserService userService){
        // 配置service属性
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("1.0.0");

        // 配置service中方法级的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(2000);
        methodConfig.setRetries(2);

        // methodConfig保存到service中
        ArrayList<MethodConfig> methods = new ArrayList<>();
        methods.add(methodConfig);
        serviceConfig.setMethods(methods);

        return serviceConfig;
    }

}
