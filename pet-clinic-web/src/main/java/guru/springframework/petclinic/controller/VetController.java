package guru.springframework.petclinic.controller;

import guru.springframework.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets/all", "vets", "vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/vet";
    }

    @RequestMapping("find")
    public String findVets() {
        return "not_implemented";
    }
}
