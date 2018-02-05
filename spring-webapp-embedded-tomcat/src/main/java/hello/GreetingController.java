package hello;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    private static final Logger LOGGER = Logger.getLogger(GreetingController.class);

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        LOGGER.info("Received request with name " + name );
        model.addAttribute("name", name);
        return "greeting";
    }

}
