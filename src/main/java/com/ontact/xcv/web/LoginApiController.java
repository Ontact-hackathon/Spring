package com.ontact.xcv.web;

import com.ontact.xcv.service.LoginService;
import com.ontact.xcv.service.RegisterService;
import com.ontact.xcv.web.dto.login.LoginListResponseDto;
import com.ontact.xcv.web.dto.login.LoginSaveRequestDto;
import com.ontact.xcv.web.dto.register.RegisterListResponseDto;
import com.ontact.xcv.web.dto.register.RegisterSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class LoginApiController {
    private final LoginService loginService;

    @PostMapping("/api/login")
    public Long save(@RequestBody LoginSaveRequestDto loginSaveRequestDto){
        return loginService.save(loginSaveRequestDto);
    }

    @GetMapping("/api/login")
    public List<LoginListResponseDto> findAllLogin() {
        return loginService.findAll();
    }
}
