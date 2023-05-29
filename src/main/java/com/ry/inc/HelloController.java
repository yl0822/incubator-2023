package com.ry.inc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feikong
 * @version 2023/5/29
 */
@RestController
public class HelloController {

    @GetMapping("/api/inc/hello")
    public String hello(@RequestParam String name){
        return "hello " + name;
    }
}
