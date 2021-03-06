package com.module.user.domain;

public class RegisterReq extends BaseReq {
    private String mobile;
    private String verifyCode;
    private String pwd;

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    @Override
    public String toString() {
        return "RegisterReq{" +
                "mobile='" + mobile + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public static void main(String[] args) {
        RegisterReq registerReq = new RegisterReq();
        registerReq.setMobile("1334444555");
        registerReq.setPwd("123456");
        registerReq.setVerifyCode("123456");

        System.out.println(registerReq.toString());
    }
}
