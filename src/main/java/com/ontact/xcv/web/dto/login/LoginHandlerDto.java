package com.ontact.xcv.web.dto.login;

import com.ontact.xcv.domain.login.Login;
import lombok.Getter;

import javax.persistence.GenerationType;

@Getter
public class LoginHandlerDto {
    private long id;
    private String userId;
    private String userPw;

    public LoginHandlerDto(Login entity) {
        this.id = entity.getId();
        this.userId = entity.getUserId();
        this.userPw = entity.getUserPw();
    }
}
