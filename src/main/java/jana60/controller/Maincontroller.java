package jana60.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Maincontroller {

	@GetMapping("/home")
	public String saluta( ) {
		return "Home" ;
	}
	
	@GetMapping ("/ora")
	public String ora(Model model) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		model.addAttribute("orario",now.format(formatter));
		return "Ora";
		
	}
}
