package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import software.neocortex.model.DirectoryAirportsModel;
import software.neocortex.service.DirectoryAirportsService;


@Controller
public class DirectoriesController {

    private DirectoryAirportsService directoryAirportsService;

    @Autowired
    @Qualifier("directoryAirportsService")
    public void setDirectoryAirportsService(DirectoryAirportsService directoryAirportsService) {
        this.directoryAirportsService = directoryAirportsService;
    }

    @RequestMapping(value = "airports", method = RequestMethod.GET)
    public String listOfAirports(Model model) {
        model.addAttribute("directoryAirportsModel", new DirectoryAirportsModel());
        model.addAttribute("listAirports", this.directoryAirportsService.listOfAirports());

        return "airports";
    }
}
