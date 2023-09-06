package com.xworkz.spiderman.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller
@Configuration
@ComponentScan("com.xworkz.spiderman")
public class SpiderManBeanConfig {
   @RequestMapping(value="/PoochiManidhan" ,method = RequestMethod.GET)
	public String getSpider(Model model) {
		if(false) model.addAttribute("NondhaMalgigai","venumaNamaku");
		else model.addAttribute("NondhaMalgigai", "namma VaalKa Edha Noki Payanama Pogudhune Therila");
		return "spiderMan";
	}
	@Bean
	public ViewResolver getView() {
		return new InternalResourceViewResolver("/WEB-INF/",".jsp");
	}
}
