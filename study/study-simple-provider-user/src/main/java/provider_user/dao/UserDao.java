package provider_user.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import provider_user.modules.User;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/8 12:40
 * @Description
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
