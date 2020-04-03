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

public class UsersJurisdictions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "u_id", type = IdType.UUID)
    private String uId;

    private String jId;


}
