package com.ssdt.controller;

import com.ssdt.domain.LoginCredentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vmaganti on 10/10/2015.
 */
@RestController
@RequestMapping("/services")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public Map<String, String> login(@RequestParam("userName") String userName,
                                     @RequestParam("password") String password) {
        LOGGER.debug("Login request", userName);
        Map<String,String> returnMap = new HashMap<String,String>();
        if(userName.equalsIgnoreCase("test")){
            returnMap.put("success", "true");
        }else{
            returnMap.put("success", "false");
        }
        return returnMap;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login", consumes = {"application/json"})
    public Map<String, String> loginPost(@RequestBody LoginCredentials loginCredentials) {
        LOGGER.debug("Login request", loginCredentials.getUserName());
        Map<String,String> returnMap = new HashMap<String,String>();
        if(loginCredentials.getUserName().equalsIgnoreCase("test")){
            returnMap.put("success", "true");
            returnMap.put("userId", loginCredentials.getUserName());
        }else{
            returnMap.put("success", "false");
        }
        return returnMap;
    }
}
