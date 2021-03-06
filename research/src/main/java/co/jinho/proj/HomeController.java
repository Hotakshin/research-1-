package co.jinho.proj;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping("home")
	public String home(Locale locale, Model model) {
		
		return "home";
	}

	@RequestMapping("login.do")
	public String login(Model model) {
		return "member/login";
	}
}
