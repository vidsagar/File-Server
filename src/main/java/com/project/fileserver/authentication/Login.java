package com.project.fileserver.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Login
{
    @CrossOrigin(origins="http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST, path="/login")
    public String Login(@RequestBody User user){
        System.out.println(user.getUserEmail());
        return ("Logged in successfully. "+user.getUserEmail()+user.getUserPassword());
    }
}
