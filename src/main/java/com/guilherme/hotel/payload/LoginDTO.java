package com.guilherme.hotel.payload;

import lombok.Data;

@Data
public class LoginDTO {
    private String email;
    private String senha;
}
