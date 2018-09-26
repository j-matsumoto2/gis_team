package com.example.linebot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LIFFController {

    @GetMapping("/liff")
    public String hello(Model model) {
        // [[${test}]] の部分を Hello... で書き換えて、liff.htmlを表示する
        model.addAttribute("test", "Hello Tymeleaf!");
        return "liff";
    }
    //これでページ移動
        @RequestMapping("/picture")
    public String pic(ModelMap modelMap, @RequestParam("type")String type,@RequestParam("category")String category,
        @RequestParam("detail")String detail){
        modelMap.addAttribute("type",type);
        modelMap.addAttribute("category",category);
        modelMap.addAttribute("detail",detail);
            return "/picture";
        }

}
