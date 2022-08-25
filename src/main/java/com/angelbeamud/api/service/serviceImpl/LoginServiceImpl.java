package com.angelbeamud.api.service.serviceImpl;

import com.angelbeamud.api.dto.LoginUserDto;
import com.angelbeamud.api.dto.TokenDto;
import com.angelbeamud.api.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    /**
    * Constructor by default
    */
    public LoginServiceImpl(){super();}

    /**
     * Do login
     *
     * @param loginUserDto User
     * @return Token
     */
    @Override
    public TokenDto login(LoginUserDto loginUserDto) {
        return null;
    }
}
