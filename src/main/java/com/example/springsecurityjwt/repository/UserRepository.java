package com.example.springsecurityjwt.repository;

import com.example.springsecurityjwt.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRepository {
    @Select("select * from account_tb where email like #{email}")
    User getAllUser(String email);
}
