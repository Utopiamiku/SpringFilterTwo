package com.miku.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 20:17
 * @description:
 */
@Data
@TableName("tb_role")
public class RoleInfo {
    @TableId(value = "role_id",type = IdType.AUTO)
    private Integer roleId;
    @TableField("role_name")
    private String roleName;
    @TableField("role_remark")
    private String roleRemark;
    @TableField("role_describe")
    private String roleDescribe;
}
