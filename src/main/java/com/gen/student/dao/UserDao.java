package com.gen.student.dao;

import com.gen.student.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Select("select count(*) from user where name=#{name} and password=#{password}")
    int login(User user);
}
