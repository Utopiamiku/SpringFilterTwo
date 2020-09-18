package com.miku.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: Utopiamiku
 * @date: 2020/9/17 19:24
 * @description:
 */
@Data
@TableName("tb_permission")
public class PermissionInfo {
    @TableId(value = "permission_id" ,type = IdType.AUTO)
    private Integer permissionId;
    @TableField("permission_name")
    private String permissionName;
}
