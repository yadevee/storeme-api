package eu.yadev.storeme.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class ApiDoksController {

	@GetMapping("/api.html")
	public RedirectView redirectWithUsingRedirectView(
			RedirectAttributes attributes) {

		attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
		attributes.addAttribute("attribute", "redirectWithRedirectView");
		return new RedirectView("/swagger-ui/index.html?url=/api-docs");
	}
}
