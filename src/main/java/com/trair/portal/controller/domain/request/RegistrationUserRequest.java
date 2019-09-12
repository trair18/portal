package com.trair.portal.controller.domain.request;

import lombok.Data;

@Data
public class RegistrationUserRequest {
    private String username;
    private String password;
    private String email;
}
