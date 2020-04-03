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

    @Override
    public String toString() {
        return "Contracts{" +
                "ctId='" + ctId + '\'' +
                ", bId='" + bId + '\'' +
                ", uId='" + uId + '\'' +
                ", ctName='" + ctName + '\'' +
                ", ctMonkey=" + ctMonkey +
                ", ctQddate=" + ctQddate +
                ", ctSxdate=" + ctSxdate +
                ", ctFwqdate=" + ctFwqdate +
                ", ctLinkman='" + ctLinkman + '\'' +
                ", ctGdphone=" + ctGdphone +
                ", ctYdphone=" + ctYdphone +
                ", ctQq=" + ctQq +
                ", ctTechnology='" + ctTechnology + '\'' +
                ", ctClause='" + ctClause + '\'' +
                ", ctFile='" + ctFile + '\'' +
                ", ctDept='" + ctDept + '\'' +
                ", ctStatus=" + ctStatus +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId;
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

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName;
    }

    public BigDecimal getCtMonkey() {
        return ctMonkey;
    }

    public void setCtMonkey(BigDecimal ctMonkey) {
        this.ctMonkey = ctMonkey;
    }

    public Date getCtQddate() {
        return ctQddate;
    }

    public void setCtQddate(Date ctQddate) {
        this.ctQddate = ctQddate;
    }

    public Date getCtSxdate() {
        return ctSxdate;
    }

    public void setCtSxdate(Date ctSxdate) {
        this.ctSxdate = ctSxdate;
    }

    public Date getCtFwqdate() {
        return ctFwqdate;
    }

    public void setCtFwqdate(Date ctFwqdate) {
        this.ctFwqdate = ctFwqdate;
    }

    public String getCtLinkman() {
        return ctLinkman;
    }

    public void setCtLinkman(String ctLinkman) {
        this.ctLinkman = ctLinkman;
    }

    public Integer getCtGdphone() {
        return ctGdphone;
    }

    public void setCtGdphone(Integer ctGdphone) {
        this.ctGdphone = ctGdphone;
    }

    public Integer getCtYdphone() {
        return ctYdphone;
    }

    public void setCtYdphone(Integer ctYdphone) {
        this.ctYdphone = ctYdphone;
    }

    public Integer getCtQq() {
        return ctQq;
    }

    public void setCtQq(Integer ctQq) {
        this.ctQq = ctQq;
    }

    public String getCtTechnology() {
        return ctTechnology;
    }

    public void setCtTechnology(String ctTechnology) {
        this.ctTechnology = ctTechnology;
    }

    public String getCtClause() {
        return ctClause;
    }

    public void setCtClause(String ctClause) {
        this.ctClause = ctClause;
    }

    public String getCtFile() {
        return ctFile;
    }

    public void setCtFile(String ctFile) {
        this.ctFile = ctFile;
    }

    public String getCtDept() {
        return ctDept;
    }

    public void setCtDept(String ctDept) {
        this.ctDept = ctDept;
    }

    public Integer getCtStatus() {
        return ctStatus;
    }

    public void setCtStatus(Integer ctStatus) {
        this.ctStatus = ctStatus;
    }
}
