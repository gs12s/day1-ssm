package com.hpf.controller;

import com.hpf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

//数据的请求
@Controller
@RequestMapping("/product")
public class ProductController {

    //普通类型参数
    @RequestMapping("/method1")
    public String method10(String name,Model model){
        model.addAttribute("name",name);
        return "success";
    }

    //http://localhost:8080/product/method2?name=tom&age=20
    //如果有多个参数想封装到对象中,那么需要参数名称和对象中的属性名称一致
    //pojo类型参数(对象类型)
    @RequestMapping("/method2")
    public String method9(User user, Model model){
        model.addAttribute("user",user);
        return "success";
    }

    //http://localhost:8080/product/method3?str=abc&str=123&str=xyz
    //数组参数类型
    @RequestMapping("/method3")
    public String method3(String[] str, Model model) {
        String newStr = Arrays.toString(str);
        model.addAttribute("str", newStr);
        return "success";
    }

    //集合参数类型
    @RequestMapping("/method4")
    public String method3(@RequestBody List<User> list, Model model){
        for (User user : list) {
            System.out.println("user = " + user);
        }
        model.addAttribute("list",list);
        return "success";
    }
}
