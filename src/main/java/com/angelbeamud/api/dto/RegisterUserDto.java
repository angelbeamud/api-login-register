package com.angelbeamud.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RegisterUserDto {

    private String name;
    private String email;
    private String password;

    private Date birthDate;
}
