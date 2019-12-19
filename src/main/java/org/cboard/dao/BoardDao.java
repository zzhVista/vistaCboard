package org.cboard.dao;

import org.cboard.pojo.DashboardBoard;
import org.cboard.pojo.DashboardBoardParam;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by yfyuan on 2016/8/23.
 */
@Repository
public interface BoardDao {

    int save(DashboardBoard board);

    List<DashboardBoard> getBoardList(String userId);

    List<DashboardBoard> getBoardListAdmin(String userId);

    long countExistBoardName(Map<String, Object> map);

    int update(DashboardBoard board);

    int delete(String id, String userId);

    DashboardBoard getBoard(String id);

    long checkBoardRole(String userId, String boardId, String permissionPattern);

    DashboardBoardParam getBoardParam(String boardId, String userId);

    int saveBoardParam(DashboardBoardParam boardParam);

    int deleteBoardParam(String boardId, String userId);
}
