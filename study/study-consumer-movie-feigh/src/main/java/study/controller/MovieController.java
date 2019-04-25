package study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import study.entity.User;
import study.service.UserService;

import java.math.BigDecimal;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/8 13:16
 * @Description
 */
@RestController
@RequestMapping("movies")
public class MovieController {


    @Autowired
    private UserService userService;
/*
    @HystrixCommand(fallbackMethod = "findByIdFallback")*/
    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id){
        // 这里用到了RestTemplate的占位符能力  调用服务端
        User user = userService.findById(id);
        return user;
    }

   /* public User findByIdFallback(Long id, Throwable throwable){
        return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
    }*/
}
