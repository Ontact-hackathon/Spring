package com.ontact.xcv.web.dto.Bank;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BankUpdateRequestDto {
    private int money;

    @Builder
    public BankUpdateRequestDto(int money)
    {
        this.money = money;
    }
}
