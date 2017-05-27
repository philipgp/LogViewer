package org.logviewer.controller;

import common.config.LogConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by philip on 27/5/17.
 */
@Controller
public class HomePageController {

    LogConfig config;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) throws Exception {
        if(config == null) {
            LogConfigReader loginConfigReader = new LogConfigReader();
            config = loginConfigReader.getConfig();
        }
        model.put("config", config);
        return "homepage";
    }
    @RequestMapping("/2")
    @ResponseBody
    public String welcome2() {
        return "asdf";
    }
}
