package com.yitong.application.api;

import com.yitong.application.service.DeptService;
import com.yitong.domain.entity.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class DeptApi {

    @Autowired
    private DeptService deptService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/createDept")
    public boolean create(@RequestBody Dept dept) {
        return deptService.create(dept);
    }

    @GetMapping("/dept/{dcode}")
    public String getDept(@PathVariable("dcode") Integer dcode) {
        Dept dept = deptService.getDept(dcode);
        log.info("deptService 8083, dept is: " +dept);
        return port;
    }

    @GetMapping("/deptList")
    public List<Dept> read(Dept dept) {
        return deptService.read(dept);
    }

    @PostMapping("/updateDept")
    public void update(@RequestBody Dept dept) {
        deptService.update(dept);
    }

    @DeleteMapping("/deleteDept")
    public void delete(@RequestBody Dept dept) {
        deptService.delete(dept);
    }
}
