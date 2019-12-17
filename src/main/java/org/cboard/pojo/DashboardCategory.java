package org.cboard.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Created by yfyuan on 2016/8/26.
 */
@TableName(value = "dashboard_category")
public class DashboardCategory {
    @TableId(value = "category_id")
    private String id;
    @TableField(value = "user_id")
    private String userId;
    @TableField(value = "category_name")
    private String name;

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
}
