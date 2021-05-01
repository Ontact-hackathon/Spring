package com.ontact.xcv.service;

import com.ontact.xcv.domain.posts.Register;
import com.ontact.xcv.domain.posts.RegisterRepository;
import com.ontact.xcv.web.dto.RegisterSaveRequestDto;
import com.ontact.xcv.web.dto.RegistersResponseDto;
import com.ontact.xcv.web.dto.RegistersUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class RegisterService {
    private final RegisterRepository registerRepository;

    @Transactional
    public Long save(RegisterSaveRequestDto requestDto){
        return registerRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, RegistersUpdateRequestDto requestDto){
        Register register = registerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시물이 없습니다. id=" + id));
        register.update(requestDto.getStore(), requestDto.getName(), requestDto.getAccount(), requestDto.getBank());

        return id;
    }

    public RegistersResponseDto findById(Long id){
        Register entity = registerRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id" + id));

        return new RegistersResponseDto(entity);
    }
//
//    @Transactional(readOnly = true)
//    public List<RegistersListResponseDto> findAll(){
//        return registerRepository.findAll().stream()
//                .map(RegistersListResponseDto::new)
//                .collect(Collectors.toList());
//    }
}
