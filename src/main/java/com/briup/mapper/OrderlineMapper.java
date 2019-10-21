package com.briup.mapper;

import com.briup.bean.Orderline;
import com.briup.bean.OrderlineExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlineMapper {
    int countByExample(OrderlineExample example);

    int deleteByExample(OrderlineExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Orderline record);

    int insertSelective(Orderline record);

    List<Orderline> selectByExample(OrderlineExample example);

    Orderline selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Orderline record, @Param("example") OrderlineExample example);

    int updateByExample(@Param("record") Orderline record, @Param("example") OrderlineExample example);

    int updateByPrimaryKeySelective(Orderline record);

    int updateByPrimaryKey(Orderline record);
}