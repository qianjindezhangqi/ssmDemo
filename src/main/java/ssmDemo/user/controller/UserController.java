package ssmDemo.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ssmDemo.user.entity.User;
import ssmDemo.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		String id=request.getParameter("id");
		List<User> list=null;
		if(id != null && !"".equals(id.trim()) && id.matches("^[1-9][0-9]*$")){
			User user=new User();
			user.setId(new Long(id));
			list= userService.queryUser(user);
		}else {
			list= userService.queryUser(new User());
		}
		model.addAttribute("user", list.toString());
		return "queryUser";
	}
}
