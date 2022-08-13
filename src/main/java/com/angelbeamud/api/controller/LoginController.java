package com.angelbeamud.api.controller;

import com.angelbeamud.api.dto.LoginUserDto;

public interface LoginController {

    /**
     * Do login
     *
     * @param loginUserDto Login user
     * @return Token
     */
    String login(LoginUserDto loginUserDto);
}
