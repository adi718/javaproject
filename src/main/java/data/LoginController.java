package data;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.SubAdminInfo;

@Controller
public class LoginController {

	@RequestMapping("/subadmin")
	public String subadminLogin(Model model)
	{
		SubAdminInfo obj=new SubAdminInfo();
		model.addAttribute("bean",obj);
		return "sub_admin_login";
	}
	
	@RequestMapping("/sub_admin_login")
	public String subadminLoginProcess(@ModelAttribute("bean") SubAdminInfo bean,Model m)
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		List list=session.createQuery("from SubAdminInfo").list();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			SubAdminInfo obj=(SubAdminInfo)it.next();
			if(obj.getUsername().trim().equals(bean.getUsername()) && obj.getPassword().trim().equals(bean.getPassword()))
			{
				
				return "sub_admin_login_success";
			}
		}
		m.addAttribute("msg","incorrect username or password");
		return "subadmin_form";
		
	}
	
	@RequestMapping("/subadminlogout")
	public String subadminLogin()
	{
		
		return "home";
	}
}
