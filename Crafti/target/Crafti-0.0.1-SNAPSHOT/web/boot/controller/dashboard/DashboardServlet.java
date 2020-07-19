package webapp.web.boot.controller.dashboard;

import java.sql.SQLException;

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
import webapp.web.user.model.User;
import webapp.web.util.Message;

@RestController
public class DashboardServlet {

	@Autowired
	User user;
	
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
	public ModelAndView createBidPage(){
		return new ModelAndView("bid");
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
				@PathVariable("bidId") int bidId
			){
		try {
			Items item = itemService.getItemById(bidId);
			Message<Bid> message = new Message<Bid>();
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
	public ModelAndView userPage(){
		return new ModelAndView("user");
	}
	
	
}
