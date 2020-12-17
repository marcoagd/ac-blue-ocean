package org.academiadecodigo.tailormoons.blue_ocean.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/splash")
    public String getSplash() {
        return "splash";
    }


}