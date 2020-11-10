package com.yitong.domain.repository;

import com.yitong.domain.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 注解方式的mapper层
 *
 * @author cp
 * @date 2020-11-09
 */
@Component
public interface UserMapper {

    @Insert("insert into user(USERNAME,AGE,BIRTH,DCODE) values(#{userName},#{age},#{birth},#{dcode})")
    boolean create(User user);

    @Select("select * from user where UID=#{uid}")
    List<User> read(User user);

    @Update("update user set USERNAME=#{userName},AGE=#{age},BIRTH=#{birth},DCODE=#{dcode} where UID=#{uid}")
    boolean update(User user);

    @Delete("delete from user where UID=#{uid}")
    boolean delete(User uid);
}
