package org.cboard.pojo;

import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;

/**
 * Created by yfyuan on 2016/8/22.
 */
public class DashboardWidget {

    private String id;
    private String userId;
    private String name;
    private String categoryName;
    private String userName;
    private String loginName;
    private String data;
    private String permission;
    private Timestamp createTime;
    private Timestamp updateTime;

    public DashboardWidget() {
    }

    public DashboardWidget(String id, String userId, String name, String data, String categoryName){
        this.id=id;
        this.userId=userId;
        this.name=name;
        this.data = data;
        this.categoryName=categoryName;
        if (StringUtils.isEmpty(categoryName)) {
            this.setCategoryName("默认分类");
        } else {
            this.categoryName = categoryName;
        }
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
