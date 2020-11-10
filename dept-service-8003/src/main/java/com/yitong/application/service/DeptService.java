package com.yitong.application.service;

import com.yitong.domain.entity.Dept;
import com.yitong.domain.repository.DeptRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    public boolean create(Dept dept) {
        log.info("+++++++ create dept is: "+ dept);
        return deptRepository.create(dept);
    }

    public Dept getDept(Integer dcode) {
        log.info("========== get dept, dcode is: "+ dcode);
        return deptRepository.getDept(dcode);
    }

    public List<Dept> read(Dept dept) {
        log.info("========== read dept is: "+ dept);
        return deptRepository.read(dept);
    }

    public boolean update(Dept dept) {
        log.info("xxxxxxxxxxx update dept is: "+ dept);
        return deptRepository.update(dept);
    }

    public boolean delete(Dept dept) {
        log.info("--------- delete dept is: "+ dept);
        return deptRepository.delete(dept);
    }
}
