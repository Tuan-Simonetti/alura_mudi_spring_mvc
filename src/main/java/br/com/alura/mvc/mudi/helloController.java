package br.com.alura.mvc.mudi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class helloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("nome", "Mundo");
        return "hello";
    }
}
