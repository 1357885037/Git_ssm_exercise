package com.huayu.sanqi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author TH
 * @since 2020-04-03
 */

public class Remittance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rq_id", type = IdType.UUID)
    private String rqId;

    private String ctId;

    private Date rqDate;

    private String reClassify;

    private BigDecimal reMonkey;

    private String reBig;

    private String reWay;

    private String uId;

    private String reDept;

    private String reText;


}
