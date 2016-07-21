package online;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CompController {

	@RequestMapping(value = "/")
	public ModelAndView students() {
	//ModelAndView modelAndView =new ModelAndView("userComplain","s", new Com());
	ModelAndView mv =new ModelAndView("userComplain");
	return mv;
	}
	
	@RequestMapping(value = "/result", method=RequestMethod.POST)
	public ModelAndView processStudnet(@Valid @ModelAttribute("s") Com com,BindingResult result) {
	ModelAndView mv = new ModelAndView();

	if (result.hasErrors()) {
		mv.setViewName("userComplain");
		}
		else {
		mv.setViewName("resultComplain");
		}
		return mv;
	}
}

