package com.ontact.xcv.service;

import com.ontact.xcv.domain.login.LoginRepository;
import com.ontact.xcv.web.dto.login.IdDuplicateDto;
import com.ontact.xcv.web.dto.login.LoginHandlerDto;
import com.ontact.xcv.web.dto.login.LoginListResponseDto;
import com.ontact.xcv.web.dto.login.LoginSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LoginService {
    private final LoginRepository loginRepository;

    @Transactional
    public Long save(LoginSaveRequestDto requestDto){
        return loginRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<LoginListResponseDto> findAll(){
        return loginRepository.findAll().stream()
                .map(LoginListResponseDto::new)
                .collect(Collectors.toList());
    }

    public List<IdDuplicateDto> checkUserIdDuplicate(String userId) {
        return loginRepository.findByUserId(userId).stream()
                .map(IdDuplicateDto::new)
                .collect(Collectors.toList());
    }

    public List<LoginHandlerDto> checkLogin(String userId) {
        return loginRepository.findByUserId(userId).stream()
                .map(LoginHandlerDto::new)
                .collect(Collectors.toList());
    }
}
