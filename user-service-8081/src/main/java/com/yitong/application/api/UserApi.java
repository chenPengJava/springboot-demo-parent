package com.yitong.application.api;

import com.yitong.application.external.CheckDeptExtClient;
import com.yitong.application.service.UserService;
import com.yitong.domain.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@Api("用户相关接口")
public class UserApi {

    @Autowired
    private UserService userService;

    @Autowired
    private CheckDeptExtClient deptExtClient;

    @ApiOperation("查询单个用户接口")
    @GetMapping("/user/{uid}")
    public List<User> getUser(@PathVariable("uid") Integer uid) {
        User user = new User();
        user.setUid(uid);
        return userService.read(user);
    }

    @ApiOperation("新增用户接口")
    @PostMapping("/user")
    public boolean create(@RequestBody User user) {
        if (user.getDcode() != null) {
            String port = deptExtClient.getDept(user.getDcode());
            log.info("create user query dept, port is: " + port);
            // todo
        }
        return userService.create(user);
    }

    @ApiOperation("批量查询用户接口")
    @GetMapping("/user")
    public List<User> read(User user) {
        String port=" dept: ";
        if (user.getDcode() != null) {
            // 远程调用dept-service
            port += deptExtClient.getDept(user.getDcode());
            log.info("read user query dept, port is: " + port);
            // todo
        }
        // 将请求部门服务的端口信息加入user信息中
        List<User> users = userService.read(user);
        for (User user1 : users) {
            user1.setUserName(user1.getUserName()+port);
        }
        return users;
    }

    @ApiOperation("更新用户接口")
    @PutMapping("/user")
    public void update(@RequestBody User user) {
        if (user.getDcode() != null) {
            String port = deptExtClient.getDept(user.getDcode());
            log.info("update user query dept, port is: " + port);
            // todo
        }
        userService.update(user);
    }

    @ApiOperation("删除用户接口")
    @DeleteMapping("/user")
    public void delete(@RequestBody User user) {
        if (user.getDcode() != null) {
            String port = deptExtClient.getDept(user.getDcode());
            log.info("delete user query dept, port is: " + port);
            // todo
        }
        userService.delete(user);
    }
}
