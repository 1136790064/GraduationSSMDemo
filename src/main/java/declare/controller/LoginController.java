package declare.controller;

import declare.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Graduation")
public class LoginController {

    private StudentService studentService;

    @RequestMapping("/Login")
    public String LoginView() {
    return "Login";
    }

}
