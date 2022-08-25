package com.angelbeamud.api.service.serviceImpl;

import com.angelbeamud.api.dto.RegisterUserDto;
import com.angelbeamud.api.service.RegisterService;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    /**
     * Constructor by default
     */
    public RegisterServiceImpl() {
        super();
    }

    /**
     * Registers a user in DB
     *
     * @param registerUserDto User
     */
    @Override
    public void register(RegisterUserDto registerUserDto) {
    }
}
