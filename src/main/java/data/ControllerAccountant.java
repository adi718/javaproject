package data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerAccountant {

	@RequestMapping("/listaccountant")
	public String accountant()
	{
		return "listacountant";
	}
}
