package com.miku.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miku.pojo.PermissionInfo;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/17 19:31
 * @description:
 */
public interface IPermissionService extends IService<PermissionInfo> {

    public ArrayList<PermissionInfo> getPermissionByRoleId(Integer roleId);
}
