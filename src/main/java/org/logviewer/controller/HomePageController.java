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

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) throws Exception {
        LogConfigReader loginConfigReader = new LogConfigReader();
        LogConfig config = loginConfigReader.getConfig();
        model.put("message", "test");
        return "homepage";
    }
    @RequestMapping("/2")
    @ResponseBody
    public String welcome2() {
        return "asdf";
    }
}
