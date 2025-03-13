package org.example.minverden.controller;

import org.example.minverden.model.Niko;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NikoController {
    private Niko niko = new Niko("Niko", "https://github.com/NikoZK", 24,"Blå");


    @GetMapping("/niko/niko-about")
    public String niko(Model model){
        model.addAttribute("niko", niko);
        return "/niko/niko-about";
    }

    @GetMapping("/niko-familie")
    public String nikofamilie(){
        return "/niko/niko-familie";
    }

    @GetMapping("/niko-yfarve")
    public String nikoyfarve(){
        return "/niko/niko-yfarve";
    }

    @GetMapping("/niko-hobby")
    public String nikohobby(){
        return "/niko/niko-hobby";
    }

    @GetMapping("/niko-funfact")
    public String nikofunfact(Model model){
        model.addAttribute("niko", niko);
        String[] funFacts = {
                "Jeg kan lave en baglæns salto(hvis jeg er fuld)",
                "Messi er bedre end Ronaldo",
                "Jeg kan vrikke med ørene",
                "Jeg var nomineret til årets numse i folkeskolen"
        };
        model.addAttribute("funFacts", funFacts);
        return "/niko/niko-funfact";
    }
}
