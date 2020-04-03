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
public class Checks implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ch_id", type = IdType.UUID)
    private String chId;

    private String chCause;

    private String uId;

    private String chDept;

    private Date chDate;

    private Date chOverdate;

    private String chState;

    private String cId;

    private String ctId;

    private String chKind;

    private String chNumber;

    private String chCilct;

    private Integer chAccount;

    private Integer chPhone;

    private BigDecimal chMonkey;

    private String chBig;

    private String chAccessory;

    @Override
    public String toString() {
        return "Checks{" +
                "chId='" + chId + '\'' +
                ", chCause='" + chCause + '\'' +
                ", uId='" + uId + '\'' +
                ", chDept='" + chDept + '\'' +
                ", chDate=" + chDate +
                ", chOverdate=" + chOverdate +
                ", chState='" + chState + '\'' +
                ", cId='" + cId + '\'' +
                ", ctId='" + ctId + '\'' +
                ", chKind='" + chKind + '\'' +
                ", chNumber='" + chNumber + '\'' +
                ", chCilct='" + chCilct + '\'' +
                ", chAccount=" + chAccount +
                ", chPhone=" + chPhone +
                ", chMonkey=" + chMonkey +
                ", chBig='" + chBig + '\'' +
                ", chAccessory='" + chAccessory + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getChId() {
        return chId;
    }

    public void setChId(String chId) {
        this.chId = chId;
    }

    public String getChCause() {
        return chCause;
    }

    public void setChCause(String chCause) {
        this.chCause = chCause;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getChDept() {
        return chDept;
    }

    public void setChDept(String chDept) {
        this.chDept = chDept;
    }

    public Date getChDate() {
        return chDate;
    }

    public void setChDate(Date chDate) {
        this.chDate = chDate;
    }

    public Date getChOverdate() {
        return chOverdate;
    }

    public void setChOverdate(Date chOverdate) {
        this.chOverdate = chOverdate;
    }

    public String getChState() {
        return chState;
    }

    public void setChState(String chState) {
        this.chState = chState;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    public String getChKind() {
        return chKind;
    }

    public void setChKind(String chKind) {
        this.chKind = chKind;
    }

    public String getChNumber() {
        return chNumber;
    }

    public void setChNumber(String chNumber) {
        this.chNumber = chNumber;
    }

    public String getChCilct() {
        return chCilct;
    }

    public void setChCilct(String chCilct) {
        this.chCilct = chCilct;
    }

    public Integer getChAccount() {
        return chAccount;
    }

    public void setChAccount(Integer chAccount) {
        this.chAccount = chAccount;
    }

    public Integer getChPhone() {
        return chPhone;
    }

    public void setChPhone(Integer chPhone) {
        this.chPhone = chPhone;
    }

    public BigDecimal getChMonkey() {
        return chMonkey;
    }

    public void setChMonkey(BigDecimal chMonkey) {
        this.chMonkey = chMonkey;
    }

    public String getChBig() {
        return chBig;
    }

    public void setChBig(String chBig) {
        this.chBig = chBig;
    }

    public String getChAccessory() {
        return chAccessory;
    }

    public void setChAccessory(String chAccessory) {
        this.chAccessory = chAccessory;
    }
}
