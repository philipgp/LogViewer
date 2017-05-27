package org.logviewer.controller;

import org.logviewer.request.GetLoginServerRequest;
import org.logviewer.request.LoginRequest;
import org.logviewer.response.GetLoginServerResponse;
import org.logviewer.response.LoginResponse;
import org.springframework.stereotype.Component;

/**
 * Created by philip on 27/5/17.
 */
@Component
public class LoginService extends BaseService{


    public LoginResponse doLogin(LoginRequest request) {
        return null;
    }
    public GetLoginServerResponse getServers(GetLoginServerRequest request) {
        return null;
    }
}
