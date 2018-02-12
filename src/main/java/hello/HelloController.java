package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String getHello (Model model) {
        model.addAttribute("text", "Hello EzGold team!");
        return "index.html";
    }
}
