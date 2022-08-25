package com.angelbeamud.api.controller.controllerImpl;

import com.angelbeamud.api.constant.LoginConstant;
import com.angelbeamud.api.controller.LoginController;
import com.angelbeamud.api.dto.LoginUserDto;
import com.angelbeamud.api.dto.TokenDto;
import com.angelbeamud.api.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = LoginConstant.ENDPOINT_LOGIN)
public class LoginControllerImpl implements LoginController {

    @Autowired
    private LoginService loginService;

    public LoginControllerImpl() {
        super();
    }

    /**
     * Do login
     *
     * @param loginUserDto Login user
     * @return Token
     */
    @Override
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public TokenDto login(@RequestBody LoginUserDto loginUserDto) {
        return this.loginService.login(loginUserDto);
    }
}
