package guru.springframework.petclinic.controller;

import guru.springframework.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/all")
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());

        return "owner/owner";
    }

    @RequestMapping("find")
    public String findOwners() {
        return "not_implemented";
    }
}
