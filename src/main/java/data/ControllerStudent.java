package data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerStudent {

@RequestMapping("/liststudent")
	public String student()
	{
		
		return "liststudent";
	}
}
