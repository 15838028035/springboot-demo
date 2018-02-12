package com.demo.springboot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @author yt.wei
 * @version 0.1
 * @description:用户VO
 * @date 2018/2/11 15:13
 */
@ApiModel(value = "UserVO", description = "用户信息")
public class UserVO implements Serializable {

    /**
     * 序列化
     */
    private static final long serialVersionUID = -1662271902540259155L;

    @ApiModelProperty(value = "用户名", required = true, example = "admin")
    private String username;

    @ApiModelProperty(value = "用户标识")
    private Long userId;

    @ApiModelProperty(value = "邮箱", required = false, example = "test@126.com")
    private String email;

    @ApiModelProperty(value = "密码", hidden = true)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserVO{" + "username='" + username + '\'' + ", userId=" + userId + ", email='"
                + email + '\'' + ", password='" + password + '\'' + '}';
    }
}
