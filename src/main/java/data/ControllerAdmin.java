package data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.SubAdminInfo;

@Controller
public class ControllerAdmin {
	
	@RequestMapping("/admin")
	public String view()
	{
		return "subadmin";
	}
	@RequestMapping("/create")
	public String view1(Model m)
	{
		SubAdminInfo obj=new SubAdminInfo();
		m.addAttribute("bean",obj);
		return "subadmin_form";
	}
	
	@RequestMapping("/save")
	public String adminSave(@ModelAttribute("bean") SubAdminInfo obj)
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(obj);
		t.commit();
		return "admin_save";
	}
}
