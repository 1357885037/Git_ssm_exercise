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

    @Override
    public String toString() {
        return "Forum{" +
                "fId='" + fId + '\'' +
                ", bId='" + bId + '\'' +
                ", uId='" + uId + '\'' +
                ", fClassify='" + fClassify + '\'' +
                ", fTitle='" + fTitle + '\'' +
                ", fAccessory='" + fAccessory + '\'' +
                ", fTexts='" + fTexts + '\'' +
                ", fNumber=" + fNumber +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
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

    public String getfClassify() {
        return fClassify;
    }

    public void setfClassify(String fClassify) {
        this.fClassify = fClassify;
    }

    public String getfTitle() {
        return fTitle;
    }

    public void setfTitle(String fTitle) {
        this.fTitle = fTitle;
    }

    public String getfAccessory() {
        return fAccessory;
    }

    public void setfAccessory(String fAccessory) {
        this.fAccessory = fAccessory;
    }

    public String getfTexts() {
        return fTexts;
    }

    public void setfTexts(String fTexts) {
        this.fTexts = fTexts;
    }

    public Integer getfNumber() {
        return fNumber;
    }

    public void setfNumber(Integer fNumber) {
        this.fNumber = fNumber;
    }
}
