package study.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import study.dao.UserDao;
import study.modules.User;
import study.service.UserService;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/8 12:44
 * @Description
 */
@Service("UserServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Override
    public User findById(Long id) {
        return this.selectById(id);
    }
}
