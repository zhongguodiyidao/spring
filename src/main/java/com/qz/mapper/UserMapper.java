package com.qz.mapper;

import com.qz.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//表示这是一个mybatis的接口
@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();
    int insertUser(User user);
    User quertUserById(int id);
    int deleteUser(int id);
    int updateUser(User user);

}
