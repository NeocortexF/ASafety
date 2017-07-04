package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import software.neocortex.service.AviasquadronDataService;

@Controller
public class AviasquadronController {
    private AviasquadronDataService aviasquadronDataService;

    @Autowired
    @Qualifier(value = "aviasquadronDataService")
    public void setAviasquadronDataService(AviasquadronDataService aviasquadronDataService) {
        this.aviasquadronDataService = aviasquadronDataService;
    }

    @RequestMapping
    public String listAviasquadronData(Model model) {

    }

}
