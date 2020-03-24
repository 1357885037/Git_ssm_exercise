package com.hy.ssm.exercise.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author mq
 * @since 2020-03-24
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String number;

    private String name;

    private String zuoze;

    private BigDecimal price;

    private String jianjie;

    private Integer nid;

    private String datebook;

    private String img;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getZuoze() {
        return zuoze;
    }

    public void setZuoze(String zuoze) {
        this.zuoze = zuoze;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }
    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getDatebook() {
        return datebook;
    }

    public void setDatebook(String datebook) {
        this.datebook = datebook;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Book{" +
        "number=" + number +
        ", name=" + name +
        ", zuoze=" + zuoze +
        ", price=" + price +
        ", jianjie=" + jianjie +
        ", nid=" + nid +
        ", datebook=" + datebook +
        ", img=" + img +
        "}";
    }
}
