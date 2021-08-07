package com.ontact.xcv.service;

import com.ontact.xcv.domain.login.Login;
import com.ontact.xcv.domain.login.LoginRepository;
import com.ontact.xcv.domain.posts.Register;
import com.ontact.xcv.web.dto.Bank.BankUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BankService {
    private final LoginRepository bankRepository;

    @Transactional
    public int update(Long id, BankUpdateRequestDto requestDto){

        Login bank = bankRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시물이 없습니다. id=" + id));
        bank.update(bank.getMoney()-requestDto.getMoney());

        return bank.getMoney();
    }
}
