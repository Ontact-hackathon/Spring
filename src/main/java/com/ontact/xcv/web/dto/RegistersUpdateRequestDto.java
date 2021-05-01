package com.ontact.xcv.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegistersUpdateRequestDto {
    private String store;
    private String name;
    private String account;
    private String bank;

    @Builder
    public RegistersUpdateRequestDto(String store, String name, String account, String bank)
    {
        this.store = store;
        this.name = name;
        this.account = account;
        this.bank = bank;
    }
}
