package com.ontact.xcv.service;

import com.ontact.xcv.domain.posts.Register;
import com.ontact.xcv.domain.posts.RegisterRepository;
import com.ontact.xcv.web.dto.register.RegisterListResponseDto;
import com.ontact.xcv.web.dto.register.RegisterSaveRequestDto;
import com.ontact.xcv.web.dto.register.RegistersResponseDto;
import com.ontact.xcv.web.dto.Bank.BankUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class RegisterService {
    private final RegisterRepository registerRepository;

    @Transactional
    public Long save(RegisterSaveRequestDto requestDto){
        return registerRepository.save(requestDto.toEntity()).getId();
    }

    public RegistersResponseDto findById(Long id){
        Register entity = registerRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id" + id));

        return new RegistersResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<RegisterListResponseDto> findAll(){
        return registerRepository.findAll().stream()
               .map(RegisterListResponseDto::new)
               .collect(Collectors.toList());
    }
}
