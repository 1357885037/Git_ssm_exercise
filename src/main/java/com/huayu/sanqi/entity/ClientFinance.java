package com.huayu.sanqi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author TH
 * @since 2020-04-03
 */
public class ClientFinance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "c_id", type = IdType.UUID)
    private String cId;

    private Integer cfNumber;

    private String cfName;

    private String cfBank;

    private String cfSite;

    private String cfDuty;

    private Integer cfPhone;


}
