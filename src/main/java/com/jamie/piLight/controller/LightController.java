package com.jamie.piLight.controller;

import com.jamie.piLight.service.LightService;
import com.pi4j.io.gpio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LightController {

    @Autowired
    private LightService lightService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("lightOn", lightService.isOn());
        return "index";
    }

    @RequestMapping(value = "/light/on")
    public String lightOn() {
        lightService.switchOn();
        return "redirect:/";
    }

    @RequestMapping(value = "/light/off")
    public String lightOff() {
        lightService.switchOff();
        return "redirect:/";
    }
}