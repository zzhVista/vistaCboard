package org.cboard.pojo;

/**
 * Created by yfyuan on 2016/12/7.
 */
public class DashboardRoleRes {
    private String roleResId;
    private String roleId;
    private String resId;
    private String resType;
    private String permission;

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getRoleResId() {
        return roleResId;
    }

    public void setRoleResId(String roleResId) {
        this.roleResId = roleResId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }
}
