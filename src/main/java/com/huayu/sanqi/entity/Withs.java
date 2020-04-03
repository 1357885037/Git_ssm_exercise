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

public class Withs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "w_id", type = IdType.UUID)
    private String wId;

    private String bId;

    private String uId;

    private String wTitle;

    private String wTexts;

    private String wAccessory;

    private Date wDate;

    private String wClassify;

    @Override
    public String toString() {
        return "Withs{" +
                "wId='" + wId + '\'' +
                ", bId='" + bId + '\'' +
                ", uId='" + uId + '\'' +
                ", wTitle='" + wTitle + '\'' +
                ", wTexts='" + wTexts + '\'' +
                ", wAccessory='" + wAccessory + '\'' +
                ", wDate=" + wDate +
                ", wClassify='" + wClassify + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getwTitle() {
        return wTitle;
    }

    public void setwTitle(String wTitle) {
        this.wTitle = wTitle;
    }

    public String getwTexts() {
        return wTexts;
    }

    public void setwTexts(String wTexts) {
        this.wTexts = wTexts;
    }

    public String getwAccessory() {
        return wAccessory;
    }

    public void setwAccessory(String wAccessory) {
        this.wAccessory = wAccessory;
    }

    public Date getwDate() {
        return wDate;
    }

    public void setwDate(Date wDate) {
        this.wDate = wDate;
    }

    public String getwClassify() {
        return wClassify;
    }

    public void setwClassify(String wClassify) {
        this.wClassify = wClassify;
    }
}
