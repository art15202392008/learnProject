package study.service;


import com.baomidou.mybatisplus.service.IService;
import study.modules.User;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/8 12:42
 * @Description
 */
public interface UserService extends IService<User> {
    User findById(Long id);
}
