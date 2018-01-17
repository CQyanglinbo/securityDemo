package com.tomyang.controller;

import com.tomyang.domain.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yangyibo on 17/1/18.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public ModelAndView index(ModelAndView modelAndView){
        Msg msg =  new Msg("测试标题","测试内容","欢迎来到HOME页面,您拥有 ROLE_HOME 权限");
        modelAndView.addObject("msg",msg);
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping("/login")
    public  ModelAndView login(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping("/admin")
    public ModelAndView admin(ModelAndView modelAndView){
        modelAndView.setViewName("admin");
        return modelAndView;
    }
}
