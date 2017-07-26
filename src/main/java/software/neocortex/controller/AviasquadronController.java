package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import software.neocortex.model.AviasquadronData;
import software.neocortex.model.SingleSquadronModel;
import software.neocortex.service.AviasquadronDataService;
import software.neocortex.service.SingleSquadronService;

@Controller
public class AviasquadronController {
    private AviasquadronDataService aviasquadronDataService;
    private SingleSquadronService singleSquadronService;

    @Autowired
    @Qualifier(value = "aviasquadronDataService")
    public void setAviasquadronDataService(AviasquadronDataService aviasquadronDataService) {
        this.aviasquadronDataService = aviasquadronDataService;
    }

    @Autowired
    @Qualifier(value = "singleSquadronService")
    public void setSingleSquadronService(SingleSquadronService singleSquadronService) {
        this.singleSquadronService = singleSquadronService;
    }

    @RequestMapping(value = "squadrondata", method = RequestMethod.GET)
    public String listAviasquadronData(Model model) {
        model.addAttribute("aviasquadronData", new AviasquadronData());
        model.addAttribute("listAviasquadronData", this.aviasquadronDataService.listAviasquadronData());

        return "squadrondata";
    }

    // TODO не должно быть на весь лист
    @RequestMapping(value = "/squadrondata/add", method = RequestMethod.POST)
    public String addAviasquadronData(@ModelAttribute("aviasquadronData") AviasquadronData aviasquadronData) {
        if(aviasquadronData.getId() == 0) {
            this.aviasquadronDataService.addAviasquadronData(aviasquadronData);
        } else {
            this.aviasquadronDataService.updateAviasquadronData(aviasquadronData);
        }

        return "redirect:/squadrondata";
    }

    @RequestMapping(value = "/sqinfo/{id}")
    public String aviasquadronDataInfo(@PathVariable("id") int id, Model model) {
        model.addAttribute("aviasquadronSingleData", this.singleSquadronService.getSingleSquadronDataById(id));

        return "sqinfo";
    }

    @RequestMapping(value = "/sqinfo/update", method = RequestMethod.POST)
    public String updateSingleAviasquadronData(@ModelAttribute("aviasquadronSingleData") SingleSquadronModel singleSquadronModel) {
        if(singleSquadronModel.getId() == 0) {
            this.singleSquadronService.addSingleSquadronData(singleSquadronModel);
        } else {
            this.singleSquadronService.updateSingleSquadronData(singleSquadronModel);
        }

        return "redirect:/sqinfo";
    }
}
