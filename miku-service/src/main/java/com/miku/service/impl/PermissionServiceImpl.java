package com.miku.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miku.dao.IPermissionMapper;
import com.miku.pojo.PermissionInfo;
import com.miku.service.IPermissionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;

/**
 * @author: Utopiamiku
 * @date: 2020/9/17 19:32
 * @description:
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<IPermissionMapper, PermissionInfo> implements IPermissionService {
    @Override
    public ArrayList<PermissionInfo> getPermissionByRoleId(Integer roleId) {
        return baseMapper.queryPermissionByRoleId(roleId);
    }
}
