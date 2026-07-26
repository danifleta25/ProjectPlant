package org.projectplant.projectplant.domain.service;

public class LoginService {


    public boolean login(String username, String password){

        return username.equals("admin") && password.equals("1234");
    }

}
