package ulusofona.fuc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ulusofona.fuc.controllers.impl.bo.FucBO;

@Controller
@RequestMapping("fuc")
public class HandleFucController {

	private static final FucBO fucBO = new FucBO();

	@RequestMapping("/all")
	public ModelAndView getAll() {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("helloworld");
		return mv;
	}
}
