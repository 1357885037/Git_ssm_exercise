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

public class Remittance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rq_id", type = IdType.UUID)
    private String rqId;

    private String ctId;

    private Date rqDate;

    private String reClassify;

    private BigDecimal reMonkey;

    private String reBig;

    private String reWay;

    private String uId;

    private String reDept;

    private String reText;

    @Override
    public String toString() {
        return "Remittance{" +
                "rqId='" + rqId + '\'' +
                ", ctId='" + ctId + '\'' +
                ", rqDate=" + rqDate +
                ", reClassify='" + reClassify + '\'' +
                ", reMonkey=" + reMonkey +
                ", reBig='" + reBig + '\'' +
                ", reWay='" + reWay + '\'' +
                ", uId='" + uId + '\'' +
                ", reDept='" + reDept + '\'' +
                ", reText='" + reText + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRqId() {
        return rqId;
    }

    public void setRqId(String rqId) {
        this.rqId = rqId;
    }

    public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    public Date getRqDate() {
        return rqDate;
    }

    public void setRqDate(Date rqDate) {
        this.rqDate = rqDate;
    }

    public String getReClassify() {
        return reClassify;
    }

    public void setReClassify(String reClassify) {
        this.reClassify = reClassify;
    }

    public BigDecimal getReMonkey() {
        return reMonkey;
    }

    public void setReMonkey(BigDecimal reMonkey) {
        this.reMonkey = reMonkey;
    }

    public String getReBig() {
        return reBig;
    }

    public void setReBig(String reBig) {
        this.reBig = reBig;
    }

    public String getReWay() {
        return reWay;
    }

    public void setReWay(String reWay) {
        this.reWay = reWay;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getReDept() {
        return reDept;
    }

    public void setReDept(String reDept) {
        this.reDept = reDept;
    }

    public String getReText() {
        return reText;
    }

    public void setReText(String reText) {
        this.reText = reText;
    }
}
