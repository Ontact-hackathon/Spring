package com.ontact.xcv.web;

import com.ontact.xcv.service.BankService;
import com.ontact.xcv.service.RegisterService;
import com.ontact.xcv.web.dto.Bank.BankUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BankApiController {
    private final BankService bankService;

    @PutMapping("/api/bank/{id}")
    public int update(@PathVariable Long id, @RequestBody BankUpdateRequestDto requestDto){
        return bankService.update(id, requestDto);
    }
}
