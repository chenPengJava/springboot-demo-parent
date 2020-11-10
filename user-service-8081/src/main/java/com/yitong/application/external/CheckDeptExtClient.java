package com.yitong.application.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 其他服务的接口调用,用户调用部门的接口
 */
@ComponentScan
@FeignClient(value="SPRINGBOOT-DEMO-DEPT-SERVICE")
public interface CheckDeptExtClient {

    /**
     * 这里仅返回请求的服务提供者端口信息
     * @param dcode 部门编号
     * @return 端口信息
     */
    @GetMapping("/dept/{dcode}")
    String getDept(@PathVariable("dcode") Integer dcode);

}
