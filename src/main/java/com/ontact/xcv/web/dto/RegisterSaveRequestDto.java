package com.ontact.xcv.web.dto;

import com.ontact.xcv.domain.posts.Register;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegisterSaveRequestDto {
    private String store;
    private String name;
    private String account;
    private String bank;
    private String latitude;
    private String longitude;

    @Builder
    public RegisterSaveRequestDto(String store, String name, String account, String bank, String latitude, String longitude)
    {
        this.store = store;
        this.name = name;
        this.account = account;
        this.bank = bank;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Register toEntity(){
        return Register.builder()
                .store(store)
                .name(name)
                .account(account)
                .bank(bank)
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}
