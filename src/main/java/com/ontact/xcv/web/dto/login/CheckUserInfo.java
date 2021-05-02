package com.ontact.xcv.web.dto.login;

import com.ontact.xcv.domain.login.Login;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckUserInfo {
    private String bank;
    private String account;
}
