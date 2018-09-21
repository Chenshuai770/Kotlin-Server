package com.module.user.controller;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private String headUrl;

    /**
     * 员工工号
     */
    private Integer loginName;

    /**
     * 联系电话
     */
    private String phoneNum;

    /**
     * 密码
     */
    private String password;

    /**
     * 公钥
     */
    private String publicKey;

    /**
     * 私钥
     */
    private String privateKey;

    /**
     * 用户年龄
     */
    private Short age;

    /**
     * 性别：0未知；1男；2女；
     */
    private Short sex;

    private String qq;

    private String email;

    /**
     * 用户来源  3微信 5支付宝
     */
    private Short appType;

    /**
     * 用户类型 1 普通员工 2 总经理 3 安全员 4兑换员 5超级管理员
     */
    private Short userType;

    /**
     * 省
     */
    private Integer provinceId;

    /**
     * 城市
     */
    private Long cityId;

    /**
     * 区
     */
    private Integer countyId;

    /**
     * 出生年月 2012.02.27
     */
    private Date birthday;

    /**
     * 卡类型 0 身份证
     */
    private Short cardType;

    /**
     * 身份证卡号
     */
    private String cardNo;

    /**
     * 身份证地址
     */
    private String address;

    /**
     * 状态 0审核拒绝 1审核中 2 审核通过
     */
    private Short applyState;

    /**
     * 工程编号
     */
    private String projectId;

    /**
     * 班组编号
     */
    private String groupId;

    /**
     * 班组名称
     */
    private String groupName;

    /**
     * 进场时间
     */
    private Date joinTime;

    /**
     * 用户总积分 = 用户兑换积分值 + 用户剩余积分值
     */
    private Integer userTotalScore;

    /**
     * 用户兑换积分值
     */
    private Integer userExchangeScore;

    /**
     * 用户剩余积分值
     */
    private Integer userRemainScore;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 状态 0失效 1有效
     */
    private Short state;

    /**
     * 用户编号
     */
    private String userPicId;

    /**
     * 人脸特征值
     */
    private String faceTemplate;

    public String getFaceTemplate() {
        return faceTemplate;
    }

    public void setFaceTemplate(String faceTemplate) {
        this.faceTemplate = faceTemplate;
    }

    public String getUserPicId() {
        return userPicId;
    }

    public void setUserPicId(String userPicId) {
        this.userPicId = userPicId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId 
	 *            用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName 
	 *            用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * @return 用户头像
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * @param headUrl 
	 *            用户头像
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * @return 员工工号
     */
    public Integer getLoginName() {
        return loginName;
    }

    /**
     * @param loginName 
	 *            员工工号
     */
    public void setLoginName(Integer loginName) {
        this.loginName = loginName;
    }

    /**
     * @return 联系电话
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum 
	 *            联系电话
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
	 *            密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return 公钥
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * @param publicKey 
	 *            公钥
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }

    /**
     * @return 私钥
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * @param privateKey 
	 *            私钥
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey == null ? null : privateKey.trim();
    }

    /**
     * @return 用户年龄
     */
    public Short getAge() {
        return age;
    }

    /**
     * @param age 
	 *            用户年龄
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * @return 性别：0未知；1男；2女；
     */
    public Short getSex() {
        return sex;
    }

    /**
     * @param sex 
	 *            性别：0未知；1男；2女；
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return 用户来源  3微信 5支付宝
     */
    public Short getAppType() {
        return appType;
    }

    /**
     * @param appType 
	 *            用户来源  3微信 5支付宝
     */
    public void setAppType(Short appType) {
        this.appType = appType;
    }

    /**
     * @return 用户类型 1 普通员工 2 总经理 3 安全员 4兑换员 5超级管理员
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * @param userType 
	 *            用户类型 1 普通员工 2 总经理 3 安全员 4兑换员 5超级管理员
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * @return 省
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId 
	 *            省
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * @return 城市
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * @param cityId 
	 *            城市
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * @return 区
     */
    public Integer getCountyId() {
        return countyId;
    }

    /**
     * @param countyId 
	 *            区
     */
    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    /**
     * @return 出生年月 2012.02.27
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday 
	 *            出生年月 2012.02.27
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return 卡类型 0 身份证
     */
    public Short getCardType() {
        return cardType;
    }

    /**
     * @param cardType 
	 *            卡类型 0 身份证
     */
    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    /**
     * @return 身份证卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo 
	 *            身份证卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * @return 状态 0审核拒绝 1审核中 2 审核通过
     */
    public Short getApplyState() {
        return applyState;
    }

    /**
     * @param applyState 
	 *            状态 0审核拒绝 1审核中 2 审核通过
     */
    public void setApplyState(Short applyState) {
        this.applyState = applyState;
    }

    /**
     * @return 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater 
	 *            创建人
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * @return 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate 
	 *            创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier 
	 *            修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * @return 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate 
	 *            修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return 状态 0失效 1有效
     */
    public Short getState() {
        return state;
    }

    /**
     * @param state 
	 *            状态 0失效 1有效
     */
    public void setState(Short state) {
        this.state = state;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getUserTotalScore() {
        return userTotalScore;
    }

    public void setUserTotalScore(Integer userTotalScore) {
        this.userTotalScore = userTotalScore;
    }

    public Integer getUserExchangeScore() {
        return userExchangeScore;
    }

    public void setUserExchangeScore(Integer userExchangeScore) {
        this.userExchangeScore = userExchangeScore;
    }

    public Integer getUserRemainScore() {
        return userRemainScore;
    }

    public void setUserRemainScore(Integer userRemainScore) {
        this.userRemainScore = userRemainScore;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}