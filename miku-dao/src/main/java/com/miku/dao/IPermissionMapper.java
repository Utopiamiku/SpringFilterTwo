package com.miku.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miku.pojo.PermissionInfo;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/17 19:28
 * @description:
 */
public interface IPermissionMapper extends BaseMapper<PermissionInfo> {

    public ArrayList<PermissionInfo> queryPermissionByRoleId(Integer id);
}
