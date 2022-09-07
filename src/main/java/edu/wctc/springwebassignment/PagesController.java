package edu.wctc.springwebassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {


    @GetMapping("/stepone")
    public String getStepOne(){
        return "steps/step-one";
    }

    @GetMapping("/steptwo")
    public String getStepTwo(){
        return "steps/step-two";
    }

    @GetMapping("/")
    public String getHome(){
        return "/index";
    }

    @GetMapping("/stepthree")
    public String getStepThree(){
        return "steps/step-three";
    }

}
