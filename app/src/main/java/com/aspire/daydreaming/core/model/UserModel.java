package com.aspire.daydreaming.core.model;


import com.aspire.daydreaming.core.base.BaseEntity;

import java.io.Serializable;

public class UserModel extends BaseEntity.BaseBean implements Serializable {

    private String sessionToken;
    private String authData;
    private String username;
    private String password;
    private String mobilePhoneNumber;
    private boolean mobilePhoneVerified;
    private String email;
    private boolean emailVerified;
    private String sex;
    private String sign;
    private String schoolName;
    private String graduateYear;
    private String className;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getAuthData() {
        return authData;
    }

    public void setAuthData(String authData) {
        this.authData = authData;
    }

    public boolean isMobilePhoneVerified() {
        return mobilePhoneVerified;
    }

    public void setMobilePhoneVerified(boolean mobilePhoneVerified) {
        this.mobilePhoneVerified = mobilePhoneVerified;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(String graduateYear) {
        this.graduateYear = graduateYear;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "sessionToken='" + sessionToken + '\'' +
                ", emailVerified=" + emailVerified +
                ", authData='" + authData + '\'' +
                ", mobilePhoneVerified=" + mobilePhoneVerified +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", sign='" + sign + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", graduateYear='" + graduateYear + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}