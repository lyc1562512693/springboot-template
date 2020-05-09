package com.surfilter.bootmybatis.ssm.model;

public class SmUser {
    private Integer USER_ID;

    private String USER_NAME;

    private Integer USER_TYPE;

    private String MAIL;

    private String ADDRESS;

    private String PHONE;

    private String USER_PIC;

    public Integer getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Integer USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public Integer getUSER_TYPE() {
        return USER_TYPE;
    }

    public void setUSER_TYPE(Integer USER_TYPE) {
        this.USER_TYPE = USER_TYPE;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getUSER_PIC() {
        return USER_PIC;
    }

    public void setUSER_PIC(String USER_PIC) {
        this.USER_PIC = USER_PIC;
    }
}