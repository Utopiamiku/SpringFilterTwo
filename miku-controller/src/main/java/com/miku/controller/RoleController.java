package com.miku.controller;

import com.miku.service.IRoleService;
import com.miku.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 20:22
 * @description:
 */
@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping("demo")
    public JsonResult demo() {
        return new JsonResult(roleService.queryRoleByUserId(1));
    }
}
