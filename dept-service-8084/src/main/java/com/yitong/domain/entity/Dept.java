package com.yitong.domain.entity;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer dcode;
    private String deptName;
    private String mark;
}
