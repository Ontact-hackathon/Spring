package com.ontact.xcv.web.dto.login;

import com.ontact.xcv.domain.login.Login;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginSaveRequestDto {
    private String userId;
    private String userPw;
    private String userBank;
    private String userAccount;
    private int money;

    @Builder
    public LoginSaveRequestDto(String userId, String userPw, String userBank, String userAccount, int money)
    {
        this.userId = userId;
        this.userPw = userPw;
        this.userBank = userBank;
        this.userAccount = userAccount;
        this.money = money;
    }

    public Login toEntity(){
        return Login.builder()
                .userId(userId)
                .userPw(userPw)
                .userBank(userBank)
                .userAccount(userAccount)
                .money(money)
                .build();
    }
}
