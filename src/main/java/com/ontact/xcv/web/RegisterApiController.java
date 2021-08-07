package com.ontact.xcv.web;

import com.ontact.xcv.service.RegisterService;
import com.ontact.xcv.web.dto.register.RegisterListResponseDto;
import com.ontact.xcv.web.dto.register.RegisterSaveRequestDto;
import com.ontact.xcv.web.dto.register.RegistersResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RegisterApiController {
    private final RegisterService registerService;

    @GetMapping("/api/register")
    public List<RegisterListResponseDto> findAllMemo() {
        return registerService.findAll();
    }

    @PostMapping("/api/register")
    public Long save(@RequestBody RegisterSaveRequestDto registerSaveRequestDto){
        return registerService.save(registerSaveRequestDto);
    }

    @GetMapping("/api/register/{id}")
    public RegistersResponseDto findByid(@PathVariable Long id){
        return registerService.findById(id);
    }
}
