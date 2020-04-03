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
public class Checks implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ch_id", type = IdType.UUID)
    private String chId;

    private String chCause;

    private String uId;

    private String chDept;

    private Date chDate;

    private Date chOverdate;

    private String chState;

    private String cId;

    private String ctId;

    private String chKind;

    private String chNumber;

    private String chCilct;

    private Integer chAccount;

    private Integer chPhone;

    private BigDecimal chMonkey;

    private String chBig;

    private String chAccessory;


}
