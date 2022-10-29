package com.howtobeasdet.todolistapi.payload.response;

import com.howtobeasdet.todolistapi.model.response.UserR;

public class SignInResponse {

    private UserR user;

    private String token;

    public SignInResponse(UserR user, String token) {
        this.user = user;
        this.token = token;
    }

    public UserR getUser() {
        return user;
    }

    public void setUser(UserR user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
