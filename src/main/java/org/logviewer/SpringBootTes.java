package org.logviewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by philip on 27/5/17.
 */
@SpringBootApplication
public class SpringBootTes {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootTes.class, args);
    }
}
