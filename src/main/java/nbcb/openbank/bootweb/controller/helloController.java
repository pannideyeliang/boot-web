package nbcb.openbank.bootweb.controller;

import nbcb.openbank.bootweb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author 陈佳乐
 * @create 2023-03-10-10:21
 */

@Controller
public class helloController {

    @RequestMapping(value = {"/", "/login"})
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = {"/index"})
    public String toIndex(User user, Model model) {
        if (user.getUserName().equals("admin") && user.getPassWord().equals("123456")) {
            return "login";
        } else {
            model.addAttribute("msg","用户名或者密码输入错误");
            return "login";
        }
    }
}
