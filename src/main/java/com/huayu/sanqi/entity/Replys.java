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

    @Override
    public String toString() {
        return "Replys{" +
                "rpId='" + rpId + '\'' +
                ", fId='" + fId + '\'' +
                ", uId='" + uId + '\'' +
                ", repRpid='" + repRpid + '\'' +
                ", rpText='" + rpText + '\'' +
                ", rpDate=" + rpDate +
                ", rpSuperior='" + rpSuperior + '\'' +
                ", rpStatu=" + rpStatu +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRpId() {
        return rpId;
    }

    public void setRpId(String rpId) {
        this.rpId = rpId;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getRepRpid() {
        return repRpid;
    }

    public void setRepRpid(String repRpid) {
        this.repRpid = repRpid;
    }

    public String getRpText() {
        return rpText;
    }

    public void setRpText(String rpText) {
        this.rpText = rpText;
    }

    public Date getRpDate() {
        return rpDate;
    }

    public void setRpDate(Date rpDate) {
        this.rpDate = rpDate;
    }

    public String getRpSuperior() {
        return rpSuperior;
    }

    public void setRpSuperior(String rpSuperior) {
        this.rpSuperior = rpSuperior;
    }

    public Integer getRpStatu() {
        return rpStatu;
    }

    public void setRpStatu(Integer rpStatu) {
        this.rpStatu = rpStatu;
    }
}
