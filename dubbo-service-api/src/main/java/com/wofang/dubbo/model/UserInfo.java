package com.wofang.dubbo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user_info")
public class UserInfo {
    /**
     * 用户ID
     */
    @TableId("user_id")
    private Long userId;
    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;


    /**
     * 获取 用户ID
     *
     * @return userId 用户ID
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 设置 用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 用户名称
     *
     * @return userName 用户名称
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 设置 用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
