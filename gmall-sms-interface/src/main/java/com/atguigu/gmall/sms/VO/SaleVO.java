package com.atguigu.gmall.sms.VO;

import lombok.Data;


import java.math.BigDecimal;
import java.util.List;
@Data
public class SaleVO {
    private Long skuId;

    private BigDecimal growBounds;
    private BigDecimal buyBounds;
    private List<Integer> work;

    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer fullAddOther;


    private Integer fullCount;
    private BigDecimal discount;
    private Integer ladderAddOther;
}
