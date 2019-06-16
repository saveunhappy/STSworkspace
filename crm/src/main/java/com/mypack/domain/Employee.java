package com.mypack.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Employee {
    private Long id;
    private String username;
    private String realname;
    private String password;
    private String tel;
    private String email;
    private Date inputtime;
    private Boolean state;
    private Boolean admin;
    private Department dept;
   
}