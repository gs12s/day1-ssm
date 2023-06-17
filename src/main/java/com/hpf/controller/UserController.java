package com.hpf.controller;

import com.hpf.pojo.User;
import com.hpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //注入userService
    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public String method(Model model){
        List<User> allUser = userService.findAllUser();
        for (User user : allUser) {
            System.out.println("user = " + user);
        }
        model.addAttribute("allUser",allUser);
        return "success";
    }

    //返回ModelAndView(封装了数据和页面),可以将数据携带到页面
    @RequestMapping("/method")
    public ModelAndView method1(ModelAndView modelAndView){
        modelAndView.addObject("name","tom");
        modelAndView.addObject("address","武汉市");
        //也面跳转
        modelAndView.setViewName("success");
        return modelAndView;
    }
    
    public void select(){
       System.out.println("张三");
    }
}
