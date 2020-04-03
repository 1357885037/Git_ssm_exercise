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

public class Withs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "w_id", type = IdType.UUID)
    private String wId;

    private String bId;

    private String uId;

    private String wTitle;

    private String wTexts;

    private String wAccessory;

    private Date wDate;

    private String wClassify;


}
