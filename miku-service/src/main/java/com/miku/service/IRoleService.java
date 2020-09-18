package com.miku.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miku.pojo.RoleInfo;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 20:21
 * @description:
 */
public interface IRoleService extends IService<RoleInfo> {

    public ArrayList<RoleInfo> queryRoleByUserId(Integer userIds);
}
