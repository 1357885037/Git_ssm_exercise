package com.huayu.sanqi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author TH
 * @since 2020-04-03
 */
public class Clients implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "c_id", type = IdType.UUID)
    private String cId;

    private String cName;

    private Integer cClassify;

    private String cSource;

    private String cIndustry;

    private String cUrl;

    private String cState;

    private String cCity;

    private String cSite;

    private Integer cCode;

    private String cEmail;

    private String cLinkman;

    private String cDept;

    private String cDuty;

    private Integer cSplane;

    private Integer cPhone;

    private Integer cQq;

    private String cPerson;

    private BigDecimal cCapital;

    private String cTexts;

    @Override
    public String toString() {
        return "Clients{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cClassify=" + cClassify +
                ", cSource='" + cSource + '\'' +
                ", cIndustry='" + cIndustry + '\'' +
                ", cUrl='" + cUrl + '\'' +
                ", cState='" + cState + '\'' +
                ", cCity='" + cCity + '\'' +
                ", cSite='" + cSite + '\'' +
                ", cCode=" + cCode +
                ", cEmail='" + cEmail + '\'' +
                ", cLinkman='" + cLinkman + '\'' +
                ", cDept='" + cDept + '\'' +
                ", cDuty='" + cDuty + '\'' +
                ", cSplane=" + cSplane +
                ", cPhone=" + cPhone +
                ", cQq=" + cQq +
                ", cPerson='" + cPerson + '\'' +
                ", cCapital=" + cCapital +
                ", cTexts='" + cTexts + '\'' +
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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getcClassify() {
        return cClassify;
    }

    public void setcClassify(Integer cClassify) {
        this.cClassify = cClassify;
    }

    public String getcSource() {
        return cSource;
    }

    public void setcSource(String cSource) {
        this.cSource = cSource;
    }

    public String getcIndustry() {
        return cIndustry;
    }

    public void setcIndustry(String cIndustry) {
        this.cIndustry = cIndustry;
    }

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl;
    }

    public String getcState() {
        return cState;
    }

    public void setcState(String cState) {
        this.cState = cState;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public String getcSite() {
        return cSite;
    }

    public void setcSite(String cSite) {
        this.cSite = cSite;
    }

    public Integer getcCode() {
        return cCode;
    }

    public void setcCode(Integer cCode) {
        this.cCode = cCode;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcLinkman() {
        return cLinkman;
    }

    public void setcLinkman(String cLinkman) {
        this.cLinkman = cLinkman;
    }

    public String getcDept() {
        return cDept;
    }

    public void setcDept(String cDept) {
        this.cDept = cDept;
    }

    public String getcDuty() {
        return cDuty;
    }

    public void setcDuty(String cDuty) {
        this.cDuty = cDuty;
    }

    public Integer getcSplane() {
        return cSplane;
    }

    public void setcSplane(Integer cSplane) {
        this.cSplane = cSplane;
    }

    public Integer getcPhone() {
        return cPhone;
    }

    public void setcPhone(Integer cPhone) {
        this.cPhone = cPhone;
    }

    public Integer getcQq() {
        return cQq;
    }

    public void setcQq(Integer cQq) {
        this.cQq = cQq;
    }

    public String getcPerson() {
        return cPerson;
    }

    public void setcPerson(String cPerson) {
        this.cPerson = cPerson;
    }

    public BigDecimal getcCapital() {
        return cCapital;
    }

    public void setcCapital(BigDecimal cCapital) {
        this.cCapital = cCapital;
    }

    public String getcTexts() {
        return cTexts;
    }

    public void setcTexts(String cTexts) {
        this.cTexts = cTexts;
    }
}
