package study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import study.entity.User;

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
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id){
        // 这里用到了RestTemplate的占位符能力  调用服务端
        User user = this.restTemplate.getForObject("http://study-provider-user/users/{id}",User.class,id);
        return user;
    }
}
