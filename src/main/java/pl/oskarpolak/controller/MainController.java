package pl.oskarpolak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.oskarpolak.model.FormContact;

/**
 * Created by OskarPraca on 2017-03-04.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("emailClass", new FormContact());
        model.addAttribute("success", false);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String confirmedForm(@ModelAttribute("emailClass") FormContact form, Model model) {
        // tutaj będzie się znajdować logika wysylania maila
        // z dzisiejszej lekcji
        model.addAttribute("success", true);
        System.out.println("WYSŁANO MAILA DO: " + form.getEmail());
        return "index";
    }


}
