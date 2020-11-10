package com.yitong.domain.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uid;
    private String userName;
    private Integer age;
    private Date birth;
    private Integer dcode;
}
