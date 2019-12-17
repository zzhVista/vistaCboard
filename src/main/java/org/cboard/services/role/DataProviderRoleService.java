package org.cboard.services.role;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.cboard.dao.DatasetDao;
import org.cboard.dao.DatasourceDao;
import org.cboard.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

/**
 * Created by yfyuan on 2016/12/23.
 */
@Repository
@Aspect
@Order(2)
public class DataProviderRoleService {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private DatasourceDao datasourceDao;

    @Autowired
    private DatasetDao datasetDao;

    @Value("${admin_user_id}")
    private String adminUserId;

    @Around("execution(* org.cboard.services.DataProviderService.getDimensionValues(..)) ||" +
            "execution(* org.cboard.services.DataProviderService.getColumns(..)) ||" +
            "execution(* org.cboard.services.DataProviderService.queryAggData(..)) ||" +
            "execution(* org.cboard.services.DataProviderService.viewAggDataQuery(..))")
    public Object query(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String datasourceId = (String) proceedingJoinPoint.getArgs()[0];
        String datasetId = (String) proceedingJoinPoint.getArgs()[2];
        String userId = authenticationService.getCurrentUser().getUserId();
        if (datasetId != null) {
            if (datasetDao.checkDatasetRole(userId, datasetId, RolePermission.PATTERN_READ) > 0) {
                return proceedingJoinPoint.proceed();
            }
        } else {
            if (datasourceDao.checkDatasourceRole(userId, datasourceId, RolePermission.PATTERN_READ) > 0) {
                return proceedingJoinPoint.proceed();
            }
        }
        return null;
    }

}
