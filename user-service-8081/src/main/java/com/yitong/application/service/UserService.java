package com.yitong.application.service;

import com.yitong.domain.entity.User;
import com.yitong.domain.repository.UserMapper;
import com.yitong.domain.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private UserMapper userMapper;

    public boolean create(User user) {
        log.info("+++++++ create user is: "+ user);
        return userRepository.create(user);
//        return userMapper.create(user);
    }

    public List<User> read(User user) {
        log.info("========== read user is: "+ user);
        return userRepository.read(user);
//        return userMapper.read(user);
    }

    public boolean update(User user) {
        log.info("xxxxxxxxxxx update user is: "+ user);
        return userRepository.update(user);
//        return userMapper.update(user);
    }

    public boolean delete(User user) {
        log.info("--------- delete user is: "+ user);
        return userRepository.delete(user);
//        return userMapper.delete(user);
    }
}
