package webapp.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoRest {
	
	
	@RequestMapping("/demo")
	public ModelAndView startDemo(){
		return new ModelAndView("index","message","Response from Demo Class");
	}

}
