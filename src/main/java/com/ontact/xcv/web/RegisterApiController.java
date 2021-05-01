package com.ontact.xcv.web;

import com.ontact.xcv.service.RegisterService;
import com.ontact.xcv.web.dto.RegisterListResponseDto;
import com.ontact.xcv.web.dto.RegisterSaveRequestDto;
import com.ontact.xcv.web.dto.RegistersResponseDto;
import com.ontact.xcv.web.dto.RegistersUpdateRequestDto;
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
    @PutMapping("/api/register/{id}")
    public Long update(@PathVariable Long id, @RequestBody RegistersUpdateRequestDto requestDto){
        return registerService.update(id, requestDto);
    }
    @GetMapping("/api/register/{id}")
    public RegistersResponseDto findByid(@PathVariable Long id){
        return registerService.findById(id);
    }
}
