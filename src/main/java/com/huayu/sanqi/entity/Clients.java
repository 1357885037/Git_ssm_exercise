package com.huayu.sanqi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author TH
 * @since 2020-04-03
 */
public class Clients implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "c_id", type = IdType.UUID)
    private String cId;

    private String cName;

    private Integer cClassify;

    private String cSource;

    private String cIndustry;

    private String cUrl;

    private String cState;

    private String cCity;

    private String cSite;

    private Integer cCode;

    private String cEmail;

    private String cLinkman;

    private String cDept;

    private String cDuty;

    private Integer cSplane;

    private Integer cPhone;

    private Integer cQq;

    private String cPerson;

    private BigDecimal cCapital;

    private String cTexts;


}
