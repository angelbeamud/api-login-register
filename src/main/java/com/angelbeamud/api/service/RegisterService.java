package com.angelbeamud.api.service;

import com.angelbeamud.api.dto.RegisterUserDto;

/**
 * Service to interact with the database
 *
 * @author angel
 */
public interface RegisterService {

    /**
     * Registers a user in DB
     *
     * @param registerUserDto User
     */
    void register(RegisterUserDto registerUserDto);
}
