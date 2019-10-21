package com.briup.mapper;

import com.briup.bean.Cate;
import com.briup.bean.CateExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CateMapper {
    int countByExample(CateExample example);

    int deleteByExample(CateExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Cate record);

    int insertSelective(Cate record);

    List<Cate> selectByExample(CateExample example);

    Cate selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Cate record, @Param("example") CateExample example);

    int updateByExample(@Param("record") Cate record, @Param("example") CateExample example);

    int updateByPrimaryKeySelective(Cate record);

    int updateByPrimaryKey(Cate record);
}