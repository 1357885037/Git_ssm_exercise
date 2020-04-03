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

public class Forum implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "f_id", type = IdType.UUID)
    private String fId;

    private String bId;

    private String uId;

    private String fClassify;

    private String fTitle;

    private String fAccessory;

    private String fTexts;

    private Integer fNumber;


}
