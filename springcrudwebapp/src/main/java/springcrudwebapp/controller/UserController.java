package springcrudwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import springcrudwebapp.models.User;
import springcrudwebapp.services.UserService;

@Controller
public class UserController {

    @Autowired
    User user;

    @Autowired
    UserService userService;

    @PostMapping("/insert")
    public ModelAndView saveData(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setUserName(username);
        user.setUserPassword(password);
        userService.persist(user);
        ModelAndView modelAndView = new ModelAndView();
        String str = "Inserted Successfully";
        modelAndView.addObject("str", str);
        modelAndView.setViewName("output.jsp");
        return modelAndView;
    }
}
