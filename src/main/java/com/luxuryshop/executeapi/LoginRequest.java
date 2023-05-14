package com.luxuryshop.executeapi;

import lombok.Getter;
import lombok.Setter;

/**
 * Copyright 2019 {@author Loda} (https://loda.me).
 * This project is licensed under the MIT license.
 *
 * @since 5/1/2019
 * Github: https://github.com/loda-kun
 */
@Getter
@Setter
public class LoginRequest {
    private String username;

    private String password;
}
