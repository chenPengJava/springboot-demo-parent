package com.yitong.application.api;

import com.yitong.application.service.DeptService;
import com.yitong.domain.entity.Dept;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@Api("部门相关接口")
public class DeptApi {

    @Autowired
    private DeptService deptService;

    @Value("${server.port}")
    private String port;

    @ApiOperation("新增部门接口")
    @PostMapping("/dept")
    public boolean create(@RequestBody Dept dept) {
        return deptService.create(dept);
    }

    @ApiOperation("查询一个部门接口")
    @GetMapping("/dept/{dcode}")
    public String getDept(@PathVariable("dcode") Integer dcode) {
        Dept dept = deptService.getDept(dcode);
        log.info("deptService 8084, dept is: " +dept);
        return port;
    }

    @ApiOperation("批量查询部门接口")
    @GetMapping("/dept")
    public List<Dept> read(Dept dept) {
        return deptService.read(dept);
    }

    @ApiOperation("更新部门接口")
    @PutMapping("/dept")
    public void update(@RequestBody Dept dept) {
        deptService.update(dept);
    }

    @ApiOperation("删除部门接口")
    @DeleteMapping("/dept/{dcode}")
    public void delete(@PathVariable("dcode") Integer dcode) {
        Dept dept = new Dept();
        dept.setDcode(dcode);
        deptService.delete(dept);
    }
}
