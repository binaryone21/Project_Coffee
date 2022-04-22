package team.project.coffee.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String home() {
		return "sample/sampleList";
	}

	@GetMapping("/sh")
	public String sh() {
		return "layout/header";
	}
}
