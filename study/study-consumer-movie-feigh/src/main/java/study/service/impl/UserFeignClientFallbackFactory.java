package study.service.impl;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import study.entity.User;
import study.service.UserService;

import java.math.BigDecimal;


/**  
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/15 15:10
 * @Description   
 */  
@Service
public class UserFeignClientFallbackFactory implements FallbackFactory<UserService> {
/*
    @Override
    public User findById(Long id) {
        return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
    }*/

    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User findById(Long id) {
                return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
            }
        };
    }
}
