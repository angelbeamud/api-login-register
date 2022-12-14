package com.angelbeamud.api.controller;

import com.angelbeamud.api.dto.LoginUserDto;
import com.angelbeamud.api.dto.TokenDto;

public interface LoginController {

    /**
     * Do login
     *
     * @param loginUserDto Login user
     * @return Token
     */
    TokenDto login(LoginUserDto loginUserDto);
}
