package com.study.dao;

import com.study.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

	@Insert("insert user(id,user_name) values(#{id},#{userName})")
	void insert(User u);
	
	@Select("select id,user_name from user where id=#{id} ")
	User findById(@Param("id") String id);

	//注：方法名和要UserMapper.xml中的id一致
	List<User> query(@Param("userName") String userName);
	
}
