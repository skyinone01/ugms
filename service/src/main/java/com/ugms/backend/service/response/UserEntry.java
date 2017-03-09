package com.ugms.backend.service.response;

/**
 * Created by Roy on 2017/3/19.
 */
public class UserEntry {

    private Long user_id;
    private String secret;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
