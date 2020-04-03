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
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "b_id", type = IdType.UUID)
    private String bId;

    private String cId;

    private String bName;

    private BigDecimal bMonkey;

    private Date bDate;

    private String bSource;

    private Integer bLinkman;

    private String bDept;

    private String bDuty;

    private Integer bSpecial;

    private Integer bPhone;

    private Integer bQq;

    private String bTexts;

    private String bAccessory;

    private String uId;

    private String uParticipation;

    private String useAttention;

    private Integer bCode;

    private Integer bAudit;

    private Integer bRank;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public BigDecimal getbMonkey() {
        return bMonkey;
    }

    public void setbMonkey(BigDecimal bMonkey) {
        this.bMonkey = bMonkey;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getbSource() {
        return bSource;
    }

    public void setbSource(String bSource) {
        this.bSource = bSource;
    }

    public Integer getbLinkman() {
        return bLinkman;
    }

    public void setbLinkman(Integer bLinkman) {
        this.bLinkman = bLinkman;
    }

    public String getbDept() {
        return bDept;
    }

    public void setbDept(String bDept) {
        this.bDept = bDept;
    }

    public String getbDuty() {
        return bDuty;
    }

    public void setbDuty(String bDuty) {
        this.bDuty = bDuty;
    }

    public Integer getbSpecial() {
        return bSpecial;
    }

    public void setbSpecial(Integer bSpecial) {
        this.bSpecial = bSpecial;
    }

    public Integer getbPhone() {
        return bPhone;
    }

    public void setbPhone(Integer bPhone) {
        this.bPhone = bPhone;
    }

    public Integer getbQq() {
        return bQq;
    }

    public void setbQq(Integer bQq) {
        this.bQq = bQq;
    }

    public String getbTexts() {
        return bTexts;
    }

    public void setbTexts(String bTexts) {
        this.bTexts = bTexts;
    }

    public String getbAccessory() {
        return bAccessory;
    }

    public void setbAccessory(String bAccessory) {
        this.bAccessory = bAccessory;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuParticipation() {
        return uParticipation;
    }

    public void setuParticipation(String uParticipation) {
        this.uParticipation = uParticipation;
    }

    public String getUseAttention() {
        return useAttention;
    }

    public void setUseAttention(String useAttention) {
        this.useAttention = useAttention;
    }

    public Integer getbCode() {
        return bCode;
    }

    public void setbCode(Integer bCode) {
        this.bCode = bCode;
    }

    public Integer getbAudit() {
        return bAudit;
    }

    public void setbAudit(Integer bAudit) {
        this.bAudit = bAudit;
    }

    public Integer getbRank() {
        return bRank;
    }

    public void setbRank(Integer bRank) {
        this.bRank = bRank;
    }

    @Override
    public String toString() {
        return "Business{" +
                "bId='" + bId + '\'' +
                ", cId='" + cId + '\'' +
                ", bName='" + bName + '\'' +
                ", bMonkey=" + bMonkey +
                ", bDate=" + bDate +
                ", bSource='" + bSource + '\'' +
                ", bLinkman=" + bLinkman +
                ", bDept='" + bDept + '\'' +
                ", bDuty='" + bDuty + '\'' +
                ", bSpecial=" + bSpecial +
                ", bPhone=" + bPhone +
                ", bQq=" + bQq +
                ", bTexts='" + bTexts + '\'' +
                ", bAccessory='" + bAccessory + '\'' +
                ", uId='" + uId + '\'' +
                ", uParticipation='" + uParticipation + '\'' +
                ", useAttention='" + useAttention + '\'' +
                ", bCode=" + bCode +
                ", bAudit=" + bAudit +
                ", bRank=" + bRank +
                '}';
    }
}
