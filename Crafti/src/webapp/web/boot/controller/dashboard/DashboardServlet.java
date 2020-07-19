package webapp.web.boot.controller.dashboard;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import webapp.web.boot.item.bid.model.Bid;
import webapp.web.boot.item.bid.service.BidService;
import webapp.web.boot.item.model.Items;
import webapp.web.boot.item.service.ItemService;
import webapp.web.boot.landRent.model.Rent;
import webapp.web.boot.landRent.service.RentService;
import webapp.web.boot.user.service.UserService;
import webapp.web.user.model.User;
import webapp.web.util.Message;

@RestController
public class DashboardServlet {

	@Autowired
	User user;
	
	@Autowired
	UserService userService;
	
	@Autowired
	RentService rentService;
	
	
	@Autowired
	BidService service;
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping("/dashboard")
	public ModelAndView getMainPage(HttpServletRequest request){
		System.out.println("getting main page of dashboard");
		Message<Items> message = new Message<Items>();
		int id  = (int) request.getSession().getAttribute("userId");
		try {
			message.setList(itemService.getItemByUser(id));
			message = message.setBasic(request, message);
			return new ModelAndView("dashboard","message",message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("error");
	}
	
	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	public ModelAndView weatherPage(){
		return new ModelAndView("weather");
	}
	
	
	@RequestMapping(value = "/bid", method = RequestMethod.GET)
	public ModelAndView createBidPage(HttpServletRequest request){
		Message message = new Message();
		message = message.setBasic(request, message);
		return new ModelAndView("bid","message",message);
	}
	
	@RequestMapping(value = "/create-bid", method = RequestMethod.POST)
	public ModelAndView createBid(
				@RequestParam("name") String name,
				@RequestParam("description") String description,
				@RequestParam("price") int price,
				@RequestParam("quantity") int quantity,
				@RequestParam("type") String type,
				HttpServletRequest request,
				HttpServletResponse response
			){
		int id  = (int)request.getSession().getAttribute("userId");
		Message message = new Message();
		message = message.setBasic(request, message);
		Items item = new Items(id,name,description,price,quantity,type);
		try {
			if(itemService.save(item))
			{
				System.out.println("Bid Created");
				response.sendRedirect("dashboard");
				return null;
			}
			else
				throw new Exception();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping("/bid/{bidId}")
	public ModelAndView getBidDetails(
				@PathVariable("bidId") int bidId,
				HttpServletRequest request
				
			){
		try {
			Items item = itemService.getItemById(bidId);
			Message<Bid> message = new Message<Bid>();
			message = message.setBasic(request, message);
			message.setItem(item);
			message.setList(
						service.getAllBids(bidId)
					);
			return new ModelAndView("bidDetails","message",message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView userPage(HttpServletRequest request){
		
		Message<User> msg = new Message<User>();
		msg = msg.setBasic(request, msg);
		User user = null;
		try {
			user = userService.getUser((int)request.getSession().getAttribute("userId"));
			msg.setObject(user);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("user","message",msg);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView updateUser(
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("contact") int contact,
			@RequestParam("address") String address,
			@RequestParam("city") String city,
			@RequestParam("country") String country,
			@RequestParam("pin") int pin,
			@RequestParam("land_size") int land
			) throws IOException{
		
		User user = new User(name,address,contact,land,country,city,pin,email);
		Message<User> message = new Message<User>();
		message = message.setBasic(request, message);
		
		try {
			user.setUserId((int)request.getSession().getAttribute("userId"));
			user = userService.updateUser(user);
			
			message.setObject(user);
		} catch (Exception e){
			response.sendRedirect("./error");
			e.printStackTrace();
		}
		
		
		
		return new ModelAndView("user","message",message);
	}
	
	
	
	@RequestMapping(value = "/rent", method = RequestMethod.GET)
	public ModelAndView rentPage(){
		return new ModelAndView("rent");
	}
	
	@RequestMapping(value = "/rent", method = RequestMethod.POST)
	public ModelAndView rent(
				HttpServletRequest request,
				HttpServletResponse response,
				@RequestParam("name") String name,
				@RequestParam("description") String description,
				@RequestParam("price") int price
			){
		
		Rent rent =  new Rent((int)request.getSession().getAttribute("userId"),price,"",name,description);
		
		try {
			rentService.save(rent);
			response.sendRedirect("rent");
			return null;
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
		return new ModelAndView("error");
	}
	
	

	@RequestMapping(value = "/collab", method = RequestMethod.GET)
	public ModelAndView collabPage(){
		return new ModelAndView("collab");
	}
	
	@RequestMapping(value = "/buy", method = RequestMethod.GET)
	public ModelAndView buyPage(
				HttpServletRequest request
			) throws ClassNotFoundException, SQLException{
		
		ArrayList<Items> fixed = service.getAllBidsFixed();
		ArrayList<Items> flexible = service.getAllBidsFlexible();
		
		Message<Items> message = new Message<Items>();
		message = message.setBasic(request, message);
		message.setItems(fixed);
		message.setList(flexible);
		
		System.out.println(message.getItems().size());
//		message.setList(flexible);
		
		return new ModelAndView("buy","message",message);
	}
	
	
	
	
}
