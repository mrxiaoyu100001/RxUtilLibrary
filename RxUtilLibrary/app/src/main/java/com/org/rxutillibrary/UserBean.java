package com.org.rxutillibrary;

/**
 * @Created: xiaoyu  on 2018.01.08 11:33.
 * @Describe：
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2018.01.08 11:33.
 * @Blog:http://blog.csdn.net/noteschapter
 * @Github:https://github.com/mrxiaoyu100001
 * @Resources:
 * @Remark:
 */

public class UserBean {
    private String createTime;
    private String id;
    private String isDelete;
    private String modifyTime;
    private String pwdSalt;
    private String userEmail;
    private String userName;
    private String userPhone;
    private String userPwd;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPwdSalt() {
        return pwdSalt;
    }

    public void setPwdSalt(String pwdSalt) {
        this.pwdSalt = pwdSalt;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "createTime='" + createTime + '\'' +
                ", id='" + id + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                ", pwdSalt='" + pwdSalt + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
