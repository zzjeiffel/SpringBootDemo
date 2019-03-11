package com.fish.demo.controller;

import com.fish.demo.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @GetMapping("/user-list")
    public String userList(Map<String,Object> model){
        List<UserEntity> userEntityList=new ArrayList<>();
        for (int i=0;i<10;i++){
            UserEntity userEntity=new UserEntity();
            userEntity.setNickName("zzj");
            userEntity.setUserId(i);
            userEntity.setUserName("新员工777");
            userEntity.setPassword("123456");
            userEntityList.add(userEntity);
        }
        model.put("userList",userEntityList);
        return "userList";
    }
}
