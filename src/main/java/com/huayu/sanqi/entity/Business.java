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
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "b_id", type = IdType.UUID)
    private String bId;

    private String cId;

    private String bName;

    private BigDecimal bMonkey;

    private Date bDate;

    private String bSource;

    private Integer bLinkman;

    private String bDept;

    private String bDuty;

    private Integer bSpecial;

    private Integer bPhone;

    private Integer bQq;

    private String bTexts;

    private String bAccessory;

    private String uId;

    private String uParticipation;

    private String useAttention;

    private Integer bCode;

    private Integer bAudit;

    private Integer bRank;


}
