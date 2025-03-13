package org.example.minverden.controller;

import org.example.minverden.model.Person;
import org.example.minverden.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class ValdeController {

    private final Person valde = new Person("Valdemar","https://github.com/shuresm57",30, "Grøn");

    @GetMapping("/valde/valde-about")
    public String valde(Model model){
        model.addAttribute("valde", valde);
        return "valde/valde-about";
    }

    @GetMapping("/valde-familie")
    public String showFamilie(Model model) {
        List<String> familie = FileUtil.readTextFile("src/main/resources/static/valde-info/valdesfamilie");
        model.addAttribute("familie", familie);
        return "valde/valde-familie";
    }

    @GetMapping("/valde-funfact")
    public String valdeFunFacts(Model model) {
        List<String> funFacts = FileUtil.readTextFile("src/main/resources/static/valde-info/valdesfunfacts");
        model.addAttribute("funFacts", funFacts);
        return "valde/valde-funfact";
    }

    @GetMapping("/valde-hobby")
    public String showHobby(Model model){
        model.addAttribute("valde", valde);
        List<String> hobby = FileUtil.readTextFile("src/main/resources/static/valde-info/valdeshobbyer");
        model.addAttribute("hobby", hobby);
        return"valde/valde-hobby";
    }

    @GetMapping("/valde-yfarve")
    public String showYndlingsfarve(Model model){
        List<String> farve = FileUtil.readTextFile("src/main/resources/static/valde-info/valdesfarve");
        model.addAttribute("farve", farve);
        return"valde/valde-yfarve";
    }

}
