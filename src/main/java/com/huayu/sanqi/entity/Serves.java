package com.huayu.sanqi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.sql.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author TH
 * @since 2020-04-03
 */

public class Serves implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "s_id", type = IdType.UUID)
    private String sId;

    private String ctId;

    private String sType;

    private String sWay;

    private Date sSdate;

    private Date sOdate;

    private String sText;

    private String sFeedback;

    private Integer sGrade;

    private String sAccessory;

    private String sName;

    private Integer sStatu;


}
