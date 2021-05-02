package com.ontact.xcv.web.dto.login;

import com.ontact.xcv.domain.login.Login;
import lombok.Getter;

@Getter
public class IdDuplicateDto {
    private String userId;

    public IdDuplicateDto(Login entity) {
        this.userId = entity.getUserId();
    }
}
