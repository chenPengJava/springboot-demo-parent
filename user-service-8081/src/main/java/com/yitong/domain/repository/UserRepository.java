package com.yitong.domain.repository;

import com.yitong.domain.entity.User;
import com.yitong.domain.repository.base.GenericRepository;
import org.springframework.stereotype.Component;

/**
 * 这里相当于我们写的UserMapper或UserDao
 */
@Component
public interface UserRepository extends GenericRepository<User> {
}
