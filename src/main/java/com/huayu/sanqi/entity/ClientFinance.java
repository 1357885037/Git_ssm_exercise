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

    @Override
    public String toString() {
        return "ClientFinance{" +
                "cId='" + cId + '\'' +
                ", cfNumber=" + cfNumber +
                ", cfName='" + cfName + '\'' +
                ", cfBank='" + cfBank + '\'' +
                ", cfSite='" + cfSite + '\'' +
                ", cfDuty='" + cfDuty + '\'' +
                ", cfPhone=" + cfPhone +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public Integer getCfNumber() {
        return cfNumber;
    }

    public void setCfNumber(Integer cfNumber) {
        this.cfNumber = cfNumber;
    }

    public String getCfName() {
        return cfName;
    }

    public void setCfName(String cfName) {
        this.cfName = cfName;
    }

    public String getCfBank() {
        return cfBank;
    }

    public void setCfBank(String cfBank) {
        this.cfBank = cfBank;
    }

    public String getCfSite() {
        return cfSite;
    }

    public void setCfSite(String cfSite) {
        this.cfSite = cfSite;
    }

    public String getCfDuty() {
        return cfDuty;
    }

    public void setCfDuty(String cfDuty) {
        this.cfDuty = cfDuty;
    }

    public Integer getCfPhone() {
        return cfPhone;
    }

    public void setCfPhone(Integer cfPhone) {
        this.cfPhone = cfPhone;
    }
}
