package com.angelbeamud.api.service;

import com.angelbeamud.api.dto.LoginUserDto;
import com.angelbeamud.api.dto.TokenDto;

/**
 * Service to interact with the database
 *
 * @author angel
 */
public interface LoginService {

    /**
     * Do login
     *
     * @param loginUserDto User
     * @return Token
     */
    TokenDto login(LoginUserDto loginUserDto);
}
