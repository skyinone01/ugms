package com.ugms.backend.service.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by Roy on 2017/3/15.
 */
public class UserCreateRequest {

    @JsonProperty("user_id")
    @NotNull
    Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
