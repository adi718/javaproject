package data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.AccountantInfo;

@Controller
public class ControllerSubadmin {

	@RequestMapping("/add_accountant")
	public String view()
	{
		return "sub_admin_home";
	}
	
	@RequestMapping("/accountant_create")
	public String createAccountant(Model model)
	{
		AccountantInfo obj=new AccountantInfo();
		model.addAttribute("bean",obj);
		return "accountant_form";
	}

	@RequestMapping("/accountant_info_process")
	public ModelAndView accountantSave(@ModelAttribute("bean") AccountantInfo bean)
	{
		ModelAndView model=new ModelAndView("save_accountant");
		return model;
	}
}
