package com.example.mapper;

import com.example.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Create by Administrator on 2020/3/31.
 */
@Mapper
public interface UserMapper {

    User loadUserByUsername(@Param("username") String username);

    int reg(User user);
}
