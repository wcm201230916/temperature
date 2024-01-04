package com.example.entry;


/**
 * @Author:马薪章
 * @Version:1.0
 **/

public class Table {
    private Integer id;
    private Integer t;
    private String itime;

    public Table() {
    }

    public Table(Integer id, Integer t, String itime) {
        this.id = id;
        this.t = t;
        this.itime = itime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getT() {
        return t;
    }

    public void setT(Integer t) {
        this.t = t;
    }

    public String getItime() {
        return itime;
    }

    public void setItime(String itime) {
        this.itime = itime;
    }

}
