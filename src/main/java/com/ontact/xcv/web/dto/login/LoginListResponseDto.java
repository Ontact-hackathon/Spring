package com.ontact.xcv.web.dto.login;

import com.ontact.xcv.domain.login.Login;
import lombok.Getter;

@Getter
public class LoginListResponseDto {
    private String userId;
    private String userPw;
    private String userBank;
    private String userAccount;

    public LoginListResponseDto(Login entity) {
        this.userId = entity.getUserId();
        this.userPw = entity.getUserPw();
        this.userBank = entity.getUserBank();
        this.userAccount = entity.getUserAccount();
    }
}
