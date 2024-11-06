package com.ms.oauth2_jte_demo.advice;

import com.ms.oauth2_jte_demo.input.CsrfHiddenInput;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class CsrfTokenAdvice {
    @ModelAttribute("csrf")
    public CsrfToken csrf(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute(CsrfToken.class.getName());
    }

    @ModelAttribute("csrfHiddenInput")
    public CsrfHiddenInput csrfHiddenInput(HttpServletRequest request) {
        return new CsrfHiddenInput(csrf(request));
    }
}
