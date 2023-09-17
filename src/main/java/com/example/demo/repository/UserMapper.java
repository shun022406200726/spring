package com.example.demo.repository;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

  User search(UserSearchRequest user);

}
