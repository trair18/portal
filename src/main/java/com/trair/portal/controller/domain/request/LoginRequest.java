package com.trair.portal.controller.domain.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
