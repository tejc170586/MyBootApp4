package jp.te4a.spring.boot.myapp5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "this is a setting message");
		return "index";
	}
	
	@PostMapping(value="/post")
	public ModelAndView postForm(@RequestParam("text1") String text1) {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg", "you write '" + text1 + "'!!!");
		return mv;
	}
}
