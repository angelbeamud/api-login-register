package com.angelbeamud.api.controller;

import com.angelbeamud.api.dto.RegisterUserDto;

public interface RegisterController {
    /**
     * Save a user in database
     *
     * @param registerUserDto Register user
     */
    void register(RegisterUserDto registerUserDto);
}
