package com.guilherme.hotel.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpDTO {

    private String name;
    private String email;
    private String password;

}