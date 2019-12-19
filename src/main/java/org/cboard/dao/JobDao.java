package org.cboard.dao;

import org.cboard.pojo.DashboardJob;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by yfyuan on 2017/2/17.
 */
@Repository
public interface JobDao {
    int save(DashboardJob job);

    int update(DashboardJob job);

    List<DashboardJob> getJobList(String userId);

    List<DashboardJob> getJobListAdmin(String userId);

    int delete(String jobId);

    int updateLastExecTime(String jobId, Date date);

    int updateStatus(String jobId, Long status, String log);

    DashboardJob getJob(String jobId);

    long checkJobRole(String userId, String jobId, String permissionPattern);

}
