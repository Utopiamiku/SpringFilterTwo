package com.miku.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miku.dao.IRoleMapper;
import com.miku.pojo.RoleInfo;
import com.miku.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 20:21
 * @description:
 */
@Service
@Transactional
public class RoleServiceImpl extends ServiceImpl<IRoleMapper, RoleInfo> implements IRoleService {
    @Autowired
    private IRoleMapper roleMapper;
    @Override
    public ArrayList<RoleInfo> queryRoleByUserId(Integer userId) {
        return roleMapper.queryRoleByUserId(userId);
    }
}
