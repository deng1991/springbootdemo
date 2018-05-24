package com.example.controller.user;

import com.example.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/manage")
public class userController {
    @RequestMapping(value = "/user/{userid}",method = RequestMethod.POST,consumes="application/json")
    public User getUserInfo(@PathVariable String  userid ,@RequestBody Map<String,Object> param){
        User user = new User();
        user.setId(userid);
        System.out.println(user);
        return user;
    }
}
