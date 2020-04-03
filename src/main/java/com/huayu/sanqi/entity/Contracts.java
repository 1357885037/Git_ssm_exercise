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

public class Contracts implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ct_id", type = IdType.UUID)
    private String ctId;

    private String bId;

    private String uId;

    private String ctName;

    private BigDecimal ctMonkey;

    private Date ctQddate;

    private Date ctSxdate;

    private Date ctFwqdate;

    private String ctLinkman;

    private Integer ctGdphone;

    private Integer ctYdphone;

    private Integer ctQq;

    private String ctTechnology;

    private String ctClause;

    private String ctFile;

    private String ctDept;

    private Integer ctStatus;


}
