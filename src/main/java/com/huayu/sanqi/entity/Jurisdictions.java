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

public class Jurisdictions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "j_id", type = IdType.UUID)
    private String jId;

    private String jurJid;

    private String jName;

    private String jUrl;

    @Override
    public String toString() {
        return "Jurisdictions{" +
                "jId='" + jId + '\'' +
                ", jurJid='" + jurJid + '\'' +
                ", jName='" + jName + '\'' +
                ", jUrl='" + jUrl + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getjId() {
        return jId;
    }

    public void setjId(String jId) {
        this.jId = jId;
    }

    public String getJurJid() {
        return jurJid;
    }

    public void setJurJid(String jurJid) {
        this.jurJid = jurJid;
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName;
    }

    public String getjUrl() {
        return jUrl;
    }

    public void setjUrl(String jUrl) {
        this.jUrl = jUrl;
    }
}
