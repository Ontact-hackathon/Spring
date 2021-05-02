package com.ontact.xcv.web.dto.login;

import com.ontact.xcv.domain.login.Login;
import lombok.Getter;

import javax.persistence.GenerationType;

@Getter
public class UserInfoDto {
    private String userId;
    private String userPw;
    private String userBank;
    private String userAccount;

    public UserInfoDto(Login entity) {
        this.userId = entity.getUserId();
        this.userPw = entity.getUserPw();
        this.userBank = entity.getUserBank();
        this.userAccount = entity.getUserAccount();
    }
}
