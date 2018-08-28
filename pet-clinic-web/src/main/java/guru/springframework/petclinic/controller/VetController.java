package guru.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    @RequestMapping("/all")
    public String listVets() {
        return "vet/vet";
    }
}