package com.miku.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miku.dao.IUserMapper;
import com.miku.pojo.PermissionInfo;
import com.miku.pojo.RoleInfo;
import com.miku.pojo.UserInfo;
import com.miku.service.IPermissionService;
import com.miku.service.IRoleService;
import com.miku.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 19:29
 * @description:
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<IUserMapper, UserInfo> implements IUserService, UserDetailsService {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IPermissionService permissionService;

    /*登录相关*/
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", s);
        UserInfo userInfo = getOne(wrapper);
        if (userInfo == null)
            throw new UsernameNotFoundException("账号不存在！");
        List<SimpleGrantedAuthority> roles = new ArrayList<>();

        /*查询除当前用户所有角色*/
        ArrayList<RoleInfo> roleInfos = roleService.queryRoleByUserId(userInfo.getUserId());

        Set<PermissionInfo> permissionInfos = new HashSet<>();
        for (RoleInfo role : roleInfos) {
            /*将角色放入roles*/
            roles.add(new SimpleGrantedAuthority(role.getRoleDescribe()));
            /*查询当前角色所有权限*/
            permissionInfos.addAll(permissionService.getPermissionByRoleId(role.getRoleId()));
        }
        Iterator<PermissionInfo> iterator = permissionInfos.iterator();
        while ((iterator.hasNext())) {
            /*将权限放入roles*/
            roles.add(new SimpleGrantedAuthority(iterator.next().getPermissionName()));
        }
        /*"{noop}" +*/
        UserDetails userDetails = new User(s,userInfo.getUserPwd(), roles);

        return userDetails;
    }

    @Override
    public UserInfo userTest() {
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", "miku");
        return getOne(wrapper);
    }
}
