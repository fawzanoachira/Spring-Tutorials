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
        int persist = userService.persist(user);
        ModelAndView modelAndView = new ModelAndView();
        if (persist > 0) {
            String str = "Inserted Successfully";
            modelAndView.addObject("str", str);
            modelAndView.setViewName("output.jsp");
            return modelAndView;
        } else {
            modelAndView.setViewName("error.jsp");
            return modelAndView;
        }
    }

    @PostMapping("/update")
    public ModelAndView updateData(HttpServletRequest request, HttpServletResponse response) {
        Integer user_id = Integer.parseInt(request.getParameter("userid"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setUserId(user_id);
        user.setUserName(username);
        user.setUserPassword(password);
        int update = userService.update(user);
        ModelAndView modelAndView = new ModelAndView();
        if (update > 0) {
            String str = "Updated Successfully";
            modelAndView.addObject("str", str);
            modelAndView.setViewName("output.jsp");
            return modelAndView;
        } else {
            modelAndView.setViewName("error.jsp");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public ModelAndView deleteData(HttpServletRequest request, HttpServletResponse response) {
        Integer user_id = Integer.parseInt(request.getParameter("userid"));
        user.setUserId(user_id);
        int delete = userService.delete(user);
        ModelAndView modelAndView = new ModelAndView();
        if (delete > 0) {
            String str = "Deleted Successfully";
            modelAndView.addObject("str", str);
            modelAndView.setViewName("output.jsp");
            return modelAndView;
        } else {
            modelAndView.setViewName("error.jsp");
            return modelAndView;
        }
    }
}
