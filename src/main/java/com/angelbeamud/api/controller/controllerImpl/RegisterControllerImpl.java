package com.angelbeamud.api.controller.controllerImpl;

import com.angelbeamud.api.constant.RegisterConstant;
import com.angelbeamud.api.controller.RegisterController;
import com.angelbeamud.api.dto.RegisterUserDto;
import com.angelbeamud.api.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = RegisterConstant.ENDPOINT_REGISTER)
public class RegisterControllerImpl implements RegisterController {

    @Autowired
    private RegisterService registerService;

    /**
     * Constructor by default
     */
    public RegisterControllerImpl() {
        super();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public void register(@RequestBody RegisterUserDto registerUserDto) {
        this.registerService.register(registerUserDto);
    }
}
