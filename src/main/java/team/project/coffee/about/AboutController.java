package team.project.coffee.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about/dolphin")
    public String aboutDolphin() {
        return "about/dolphin";
    }
}
