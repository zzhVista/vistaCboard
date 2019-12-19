package org.cboard.services.persist;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by yfyuan on 2017/2/21.
 */
public class PersistContext {
    private String dashboardId;
    private JSONObject data;

    public PersistContext(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
