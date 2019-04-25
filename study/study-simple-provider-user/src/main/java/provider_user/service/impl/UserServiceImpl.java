package provider_user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import provider_user.dao.UserDao;
import provider_user.modules.User;
import provider_user.service.UserService;

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
