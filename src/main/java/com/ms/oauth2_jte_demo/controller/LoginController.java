package com.ms.oauth2_jte_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model, String error, String logout){
        if (error != null){
            model.addAttribute("error", true);
            model.addAttribute("errorMessage", "Invalid username or password");
        }

        CsrfToken csrfToken = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
        if(csrfToken != null){
            model.addAttribute("csrf", csrfToken);
        }
        return "pages/login";
    }

    @GetMapping("/")
    public String home(){
        return "pages/home";
    }
}
