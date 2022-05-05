package com.company;

import com.opencsv.bean.CsvBindByName;

public class StateCode {
    private String serialNo;
    private String stateName;
    private Integer tin;
    private String stateCode;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Integer getTin() {
        return tin;
    }

    public void setTin(Integer tin) {
        this.tin = tin;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return "StateCode{" + "serialNo='" + serialNo + '\'' + ", stateName='" + stateName + '\'' + ", tin=" + tin
                + ", stateCode='" + stateCode + '\'' + '}';
    }

}