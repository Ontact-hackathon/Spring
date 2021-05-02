package com.ontact.xcv.web;

import com.ontact.xcv.service.LoginService;
import com.ontact.xcv.web.dto.login.*;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Check;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/userInfo/{userId}")
    public CheckUserInfo userInfo(@PathVariable String userId) {
        List<UserInfoDto> userList = loginService.checkUserInfo(userId);
        String id = ".";
        String bank = "";
        String account = "";
        if(userList.size() != 0) {
            id = userList.get(0).getUserId();
            bank = userList.get(0).getUserBank();
            account = userList.get(0).getUserAccount();
        }
        CheckUserInfo result = new CheckUserInfo();
        if(id.equals(userId)) {
            result.setBank(bank);
            result.setAccount(account);
        }

        return result;
    }

    // id 중복 체크
    @GetMapping("/api/exists/{userId}")
    public CheckUserId checkUserIdDuplicate(@PathVariable String userId) {
        List<IdDuplicateDto> idList = loginService.checkUserIdDuplicate(userId);
        String id = ".";
        if(idList.size() != 0) {
            id = idList.get(0).getUserId();
        }

        Boolean check = true;

        if(id.equals(userId))  check = false;

        CheckUserId result = new CheckUserId();
        result.setCheck(check);

        return result;
    }

    // 로그인 처리
    @GetMapping("/api/loginInfo/{userId}/{userPw}")
    public CheckLoginUser checkLogin(@PathVariable String userId, @PathVariable String userPw) {
        List<LoginHandlerDto> idpwList = loginService.checkLogin(userId);
        String id = ".", pw = "";
        if(idpwList.size() != 0) {
            id = idpwList.get(0).getUserId();
            pw = idpwList.get(0).getUserPw();
        }

        Boolean check = false;

        if(id.equals(userId) && pw.equals(userPw))  check = true;

        CheckLoginUser result = new CheckLoginUser();
        result.setCheck(check);

        return result;
    }
}
