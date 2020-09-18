package com.miku.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miku.pojo.RoleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 20:17
 * @description:
 */
public interface IRoleMapper extends BaseMapper<RoleInfo> {

    public ArrayList<RoleInfo> queryRoleByUserId(Integer id);
}
