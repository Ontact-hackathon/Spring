package com.ontact.xcv.web.dto;

import com.ontact.xcv.domain.posts.Register;
import lombok.Getter;

@Getter
public class RegisterListResponseDto {
    private String store;
    private String name;
    private String account;
    private String bank;
    private String latitude;
    private String longitude;

    public RegisterListResponseDto(Register entity) {
        this.store = entity.getStore();
        this.name = entity.getName();
        this.account = entity.getAccount();
        this.bank = entity.getBank();
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();
    }
}
