package com.miku.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miku.pojo.UserInfo;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 19:27
 * @description:
 */
public interface IUserService extends IService<UserInfo> {

    public UserInfo userTest();
}
