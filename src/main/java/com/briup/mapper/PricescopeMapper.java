package com.briup.mapper;

import com.briup.bean.Pricescope;
import com.briup.bean.PricescopeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PricescopeMapper {
    int countByExample(PricescopeExample example);

    int deleteByExample(PricescopeExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Pricescope record);

    int insertSelective(Pricescope record);

    List<Pricescope> selectByExample(PricescopeExample example);

    Pricescope selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Pricescope record, @Param("example") PricescopeExample example);

    int updateByExample(@Param("record") Pricescope record, @Param("example") PricescopeExample example);

    int updateByPrimaryKeySelective(Pricescope record);

    int updateByPrimaryKey(Pricescope record);
}