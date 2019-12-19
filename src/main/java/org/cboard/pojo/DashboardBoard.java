package org.cboard.pojo;

import java.sql.Timestamp;

/**
 * Created by yfyuan on 2016/8/18.
 */
public class DashboardBoard {

    private String id;
    private String userId;
    private String categoryId;
    private String name;
    private String layout;
    private String categoryName;
    private String userName;
    private String loginName;
    private String permission;
    private Timestamp createTime;
    private Timestamp updateTime;

    public DashboardBoard() {
    }

    public DashboardBoard(String id, String userId, String categoryId, String name,
        String layout) {
        this.id = id;
        this.userId = userId;
        this.categoryId = categoryId;
        this.name = name;
        this.layout = layout;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
