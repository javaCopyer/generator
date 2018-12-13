package org.alibaba.dao.mapper;

import com.mh.entity.TBetRecordBbin;
import com.mh.entity.TBetRecordBbinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBetRecordBbinMapper {
    long countByExample(TBetRecordBbinExample example);

    int deleteByExample(TBetRecordBbinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBetRecordBbin record);

    int insertSelective(TBetRecordBbin record);

    List<TBetRecordBbin> selectByExampleWithBLOBs(TBetRecordBbinExample example);

    List<TBetRecordBbin> selectByExample(TBetRecordBbinExample example);

    TBetRecordBbin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBetRecordBbin record, @Param("example") TBetRecordBbinExample example);

    int updateByExampleWithBLOBs(@Param("record") TBetRecordBbin record, @Param("example") TBetRecordBbinExample example);

    int updateByExample(@Param("record") TBetRecordBbin record, @Param("example") TBetRecordBbinExample example);

    int updateByPrimaryKeySelective(TBetRecordBbin record);

    int updateByPrimaryKeyWithBLOBs(TBetRecordBbin record);

    int updateByPrimaryKey(TBetRecordBbin record);
}