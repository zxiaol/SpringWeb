package com.xiaomingyk.buildintomcat.controller;
import com.xiaomingyk.buildintomcat.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

/**
 * Created by My on 1/12/2017.
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student(){

        return new ModelAndView("student", "command", new Student());

    }
}



