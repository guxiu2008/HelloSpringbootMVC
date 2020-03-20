package com.guxiu2008.hellospringbootmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

/**
 * Package: com.guxiu2008.hellospringbootmvc
 * DESCRIPTION:
 *
 * @author guxiu2008
 * @create 2020-03-19 21:26
 **/
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("id") Integer id, Model model) {
        return "a/Helloworld";
    }
}
