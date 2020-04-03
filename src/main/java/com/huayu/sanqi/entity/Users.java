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

public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "u_id", type = IdType.UUID)
    private String uId;

    private String uName;

    private String upass;

    private String uRealname;

    private Integer uSex;

    private Integer uPhone;

    private Date uDate;

    private String uHome;

    private String uEmail;

    private String uSignature;

    private String uImg;


}
