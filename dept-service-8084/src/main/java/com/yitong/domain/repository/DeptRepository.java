package com.yitong.domain.repository;

import com.yitong.domain.entity.Dept;
import com.yitong.domain.repository.base.GenericRepository;
import org.springframework.stereotype.Component;

/**
 * 这里相当于我们写的dao层
 */
@Component
public interface DeptRepository extends GenericRepository<Dept> {
    Dept getDept(Integer dcode);
}
