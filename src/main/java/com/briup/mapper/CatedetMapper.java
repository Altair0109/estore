package com.briup.mapper;

import com.briup.bean.Catedet;
import com.briup.bean.CatedetExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatedetMapper {
    int countByExample(CatedetExample example);

    int deleteByExample(CatedetExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Catedet record);

    int insertSelective(Catedet record);

    List<Catedet> selectByExample(CatedetExample example);

    Catedet selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Catedet record, @Param("example") CatedetExample example);

    int updateByExample(@Param("record") Catedet record, @Param("example") CatedetExample example);

    int updateByPrimaryKeySelective(Catedet record);

    int updateByPrimaryKey(Catedet record);
}