package com.module.user.controller;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//



import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = -7014548674611115765L;
    private T data;
    private boolean isSuccess = false;
    private String retMsg;
    private String retCode;
    private String exceptionMsg;

    public Result() {
    }

    public static <T> Result<T> buildFail(String strRetCode, String strRetMsg, String strExceptionMsg, T data) {
        Result<T> result = new Result();
        result.setSuccess(false);
        result.setRetCode(strRetCode);
        result.setRetMsg(strRetMsg);
        result.setExceptionMsg(strExceptionMsg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> buildFail(String strExceptionMsg, T data) {
        return buildFail("1", strExceptionMsg, strExceptionMsg, data);
    }

    public static <T> Result<T> buildFail(String strRetCode, String strRetMsg, String strExceptionMsg) {
        Result<T> result = new Result();
        result.setSuccess(false);
        result.setRetCode(strRetCode);
        result.setRetMsg(strRetMsg);
        result.setExceptionMsg(strExceptionMsg);
        return result;
    }

    public static <T> Result<T> buildFail(String strExceptionMsg) {
        return buildFail("1", strExceptionMsg, strExceptionMsg);
    }

    public static <T> Result<T> buildSucc(String strRetCode, String strRetMsg, T data) {
        Result<T> result = new Result();
        result.setSuccess(true);
        result.setRetCode(strRetCode);
        result.setRetMsg(strRetMsg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> buildSucc(String strRetCode, T data) {
        return buildSucc("0", strRetCode, data);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getRetCode() {
        return this.retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
