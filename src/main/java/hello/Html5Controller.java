/*
08Sep2017 RLW: Replaced @GetMapping and @PostMapping with @RequestMapping

*/

package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
public class Html5Controller {
	
    @GetMapping("/html5") // the last part of the URL
    public String html5Form(Model model) { //String has to be named per template
    	// what model class are we using
    	model.addAttribute("html5", new Html5());
    	// the template that is used to present this to the user
    	ArrayList<RadioButton> radioButtons = Html5.buildRadioButtons();
    	ArrayList<CheckBox> checkBoxes = Html5.buildCheckBoxes();
    	model.addAttribute("radioButtons", radioButtons);
    	model.addAttribute("checkBoxes", checkBoxes);
    	return "html5";
    }
    
    @PostMapping("/html5") // the last part of the URL
    // what model class are we using
    public String html5Submit(@ModelAttribute Html5 html5) {
    	// the template that is used to present this to the user
        return "html5result";
    }
}
	