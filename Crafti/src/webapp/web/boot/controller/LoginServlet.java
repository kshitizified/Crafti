package webapp.web.boot.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import webapp.web.boot.user.service.UserService;

import webapp.web.user.model.User;
import webapp.web.util.Message;

@RestController
public class LoginServlet {
	
	@Autowired
	UserService service;
	
	
	@RequestMapping("/")
	public ModelAndView StartApp(){
		System.out.println("App Started");
		return new ModelAndView("login");
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView getLogin(){
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(
			HttpServletResponse response,
			HttpServletRequest request,
			@RequestParam("contact") int contact,
			@RequestParam("password") String password
			) throws IOException{
		User user  = new User(contact,password);
		Message<User> message = null;
		try {
			if(service.checkUserCredentials(user,request)!=-1)
			{
				message = new Message<User>();
				System.out.println("dashboard");
//				request.getSession().setAttribute("userId",3);
				response.sendRedirect("dashboard");
				//reqest.getSession().s
				return null;
//				return new ModelAndView("dashboard","message",message);
			}
			else{
				message = new Message<User>("Invalid Credentials","Invalid Credentials",200);
				return new ModelAndView("login","message",message);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView getRegister(){
		return new ModelAndView("register");
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(
			@RequestParam("contact") int contact,
			@RequestParam("password") String password,
			@RequestParam("type") String type,
			@RequestParam("name") String name
			){
		User user  = new User(name,contact,password,type);
		Message<User> message = null;
		try {
			if(service.isUser(user))
			{
				System.out.println("User already exist!!");
				message = new Message<User>("User already exist","User already exist",500);
				return new ModelAndView("register","message",message);
			}
			else
			{
				System.out.println("registered");
				message = new Message<User>();
				service.saveUser(user);
				return new ModelAndView("login","message",message);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
