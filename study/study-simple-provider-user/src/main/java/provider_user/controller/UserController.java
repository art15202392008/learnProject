package provider_user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider_user.modules.User;
import provider_user.service.UserService;

import java.util.Optional;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/8 12:41
 * @Description
 */
@RequestMapping("/users")
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findByid(@PathVariable Long id){
        return userService.findById(id);
    };

}
