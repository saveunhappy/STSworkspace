package com.example.mybatis.mapper;
import java.util.List;

import com.example.mybatis.domain.Permission;

public interface PermissionMapper {
    List<Permission> selectAll();
    void insert(Permission permission);
}