package org.example.minverden.controller;

import org.example.minverden.model.Person;
import org.example.minverden.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ValdeController {

    private Person valde = new Person("Valdemar","https://github.com/shuresm57",30, "Grøn");

    @GetMapping("/valde/valde-about")
    public String valde(Model model){
        model.addAttribute("valde", valde);
        return "valde/valde-about";
    }

    @GetMapping("/valde-familie")
    public String showPersonPage(Model model) {
        model.addAttribute("message", FileUtil.readTextFile("src/main/resources/static/familier/valdesfamilie"));
        return "valde/valde-familie";
    }

    @GetMapping("/valde-funfact")
    public String valdeFunFacts(Model model) {
        model.addAttribute("valde", valde);
        String[] funFacts = {
                "Ghita Nørby har råbt af mig (ikke på en sjov måde)",
                "Jeg har spillet guitar i 17 år",
                "Jeg kan lave en vejrmølle på én hånd"
        };
        model.addAttribute("funFacts", funFacts);
        return "valde/valde-funfact";
    }

    @GetMapping("/valde-hobby")
    public String valdeHobby(Model model){
        model.addAttribute("valde", valde);
        return"valde/valde-hobby";
    }

    @GetMapping("/valde-yfarve")
    public String valdeFarve(Model model){
        model.addAttribute("valde", valde);
        return"valde/valde-yfarve";
    }

}
