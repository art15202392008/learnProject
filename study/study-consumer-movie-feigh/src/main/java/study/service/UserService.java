package study.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import study.entity.User;
import study.service.impl.UserFeignClientFallbackFactory;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/12 15:40
 * @Description
 */
@FeignClient(name = "study-provider-user",fallbackFactory = UserFeignClientFallbackFactory.class)
public interface UserService {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}
