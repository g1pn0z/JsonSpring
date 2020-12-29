package com.np.jsonConfig.mvc;

import com.np.jsonConfig.bean.MainConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class Controller {

    @Autowired
    protected MainConfig todayToDo;

    @GetMapping(value = "/today", produces = "application/json")
    public MainConfig getMorningNote(){
        return todayToDo;
    }

    public String getJsonForServer(){
        return "Main ,message";
    }
}
