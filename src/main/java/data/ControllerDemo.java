package data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerDemo {
	
	@RequestMapping("/adminlogin")
	public String view()
	{
		return "login";
	}

	@RequestMapping("/login")
	public String view1(@RequestParam("t1") String u,@RequestParam("t2") String p)
	{
		if(u.equals("admin123") && p.equals("admin@123"))
		{
			return "home";
		}
		else
		{
			return "error";
		}
	}
}
