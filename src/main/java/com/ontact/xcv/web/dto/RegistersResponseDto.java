package com.ontact.xcv.web.dto;

import com.ontact.xcv.domain.posts.Register;
import lombok.Getter;

@Getter
public class RegistersResponseDto {
    private Long id;
    private String store;
    private String name;
    private String account;
    private String bank;
    private String latitude;
    private String longitude;

    public RegistersResponseDto(Register entity){
        this.id  = entity.getId();
        this.store = entity.getStore();
        this.name = entity.getName();
        this.account = entity.getAccount();
        this.bank = entity.getBank();
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();
    }
}
