package com.miku.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 19:23
 * @description:
 */
@Data
@TableName("tb_user")
public class UserInfo {
    @TableId(value = "user_id",type = IdType.AUTO)
    private Integer userId;
    @TableField("user_name")
    private String userName;
    @TableField("user_pwd")
    private String userPwd;
    @TableField("user_remark")
    private String userRemark;
}
