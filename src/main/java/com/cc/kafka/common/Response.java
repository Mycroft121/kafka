package com.cc.kafka.common;

public class Response {

    private String resultCode;

    private String resultMsg;

    private Object date;

    public Response(String resultCode, String resultMsg, Object date) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.date = date;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

}
