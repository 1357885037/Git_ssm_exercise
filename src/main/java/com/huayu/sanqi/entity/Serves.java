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

public class Serves implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "s_id", type = IdType.UUID)
    private String sId;

    private String ctId;

    private String sType;

    private String sWay;

    private Date sSdate;

    private Date sOdate;

    private String sText;

    private String sFeedback;

    private Integer sGrade;

    private String sAccessory;

    private String sName;

    private Integer sStatu;

    @Override
    public String toString() {
        return "Serves{" +
                "sId='" + sId + '\'' +
                ", ctId='" + ctId + '\'' +
                ", sType='" + sType + '\'' +
                ", sWay='" + sWay + '\'' +
                ", sSdate=" + sSdate +
                ", sOdate=" + sOdate +
                ", sText='" + sText + '\'' +
                ", sFeedback='" + sFeedback + '\'' +
                ", sGrade=" + sGrade +
                ", sAccessory='" + sAccessory + '\'' +
                ", sName='" + sName + '\'' +
                ", sStatu=" + sStatu +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getsWay() {
        return sWay;
    }

    public void setsWay(String sWay) {
        this.sWay = sWay;
    }

    public Date getsSdate() {
        return sSdate;
    }

    public void setsSdate(Date sSdate) {
        this.sSdate = sSdate;
    }

    public Date getsOdate() {
        return sOdate;
    }

    public void setsOdate(Date sOdate) {
        this.sOdate = sOdate;
    }

    public String getsText() {
        return sText;
    }

    public void setsText(String sText) {
        this.sText = sText;
    }

    public String getsFeedback() {
        return sFeedback;
    }

    public void setsFeedback(String sFeedback) {
        this.sFeedback = sFeedback;
    }

    public Integer getsGrade() {
        return sGrade;
    }

    public void setsGrade(Integer sGrade) {
        this.sGrade = sGrade;
    }

    public String getsAccessory() {
        return sAccessory;
    }

    public void setsAccessory(String sAccessory) {
        this.sAccessory = sAccessory;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsStatu() {
        return sStatu;
    }

    public void setsStatu(Integer sStatu) {
        this.sStatu = sStatu;
    }
}
