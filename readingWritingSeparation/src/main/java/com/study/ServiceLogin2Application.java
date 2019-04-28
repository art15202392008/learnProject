package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@EnableTransactionManagement(order = 10) //开启事务，并设置order值，默认是Integer的最大值
@ComponentScan(basePackages={"com.study"})
@SpringBootApplication
@RestController
public class ServiceLogin2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLogin2Application.class, args);
    }


}
