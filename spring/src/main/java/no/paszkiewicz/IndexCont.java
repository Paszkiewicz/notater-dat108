package no.paszkiewicz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller 
public class IndexCont {
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Index Page");

        return "index";
    }
}
