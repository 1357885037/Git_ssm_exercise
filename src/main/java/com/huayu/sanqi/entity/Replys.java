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

public class Replys implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rp_id", type = IdType.UUID)
    private String rpId;

    private String fId;

    private String uId;

    private String repRpid;

    private String rpText;

    private Date rpDate;

    private String rpSuperior;

    private Integer rpStatu;


}
