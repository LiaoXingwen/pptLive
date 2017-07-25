package com.lxw.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;


/**
 * Created by lxw on 2017/7/24.
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {
    @Id
    @GeneratedValue()
    private int id;

    @NotBlank(message = "名字不能为空")
    @Column(nullable = false, unique = true)
    private String name;

    @NotNull(message = "出生日期不能为空")
    @Column(nullable = false)
    private Date brithday;

    private String headurl;

    @NotBlank(message = "手机号码不能为空")
    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\\\d{8}$", message = "无效的手机号码")
    @Column(nullable = false, unique = true)
    private String phone;


    @NotBlank(message = "密码不能为空")
//    检测密码由6-21字母和数字组成，不能是纯数字或纯英文
    @Pattern(regexp = "/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,21}$/", message = "密码不符合规范")
    @Column(nullable = false)
    private String password;


    @NotNull(message = "性别不能为空")
    @Column(nullable = false)
    private int sex;

    private int state;

    private String code;

    public User() {
    }

    public User(String name, Date brithday, String headurl, String phone, String password, int sex, int state) {
        this.name = name;
        this.brithday = brithday;
        this.headurl = headurl;
        this.phone = phone;
        this.password = password;
        this.sex = sex;
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brithday=" + brithday +
                ", headurl='" + headurl + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", state=" + state +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
