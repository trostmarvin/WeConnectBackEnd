package com.weconnect.WeConnectBackEnd.request;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String username;
    private String password;
}
