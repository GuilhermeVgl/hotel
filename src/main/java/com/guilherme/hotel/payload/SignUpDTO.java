package com.guilherme.hotel.payload;

import lombok.Data;

@Data
public class SignUpDTO {

    private String nome;
    private String email;
    private String senha;

}
