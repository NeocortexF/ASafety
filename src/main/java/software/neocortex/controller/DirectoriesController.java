package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import software.neocortex.model.DirectoryAirportsModel;
import software.neocortex.model.DirectoryEngineeringPersonnelModel;
import software.neocortex.model.DirectoryFleetModel;
import software.neocortex.model.DirectoryFlightPersonnelModel;
import software.neocortex.service.DirectoryAirportsService;
import software.neocortex.service.DirectoryEngineeringPersonnelService;
import software.neocortex.service.DirectoryFleetService;
import software.neocortex.service.DirectoryFlightPersonnelService;


@Controller
public class DirectoriesController {

    private DirectoryAirportsService directoryAirportsService;
    private DirectoryEngineeringPersonnelService directoryEngineeringPersonnelService;
    private DirectoryFleetService directoryFleetService;
    private DirectoryFlightPersonnelService directoryFlightPersonnelService;

    @Autowired
    @Qualifier(value = "directoryAirportsService")
    public void setDirectoryAirportsService(DirectoryAirportsService directoryAirportsService) {
        this.directoryAirportsService = directoryAirportsService;
    }

    @Autowired
    @Qualifier(value = "directoryEngineeringPersonnelService")
    public void setDirectoryEngineeringPersonnelService(DirectoryEngineeringPersonnelService directoryEngineeringPersonnelService) {
        this.directoryEngineeringPersonnelService = directoryEngineeringPersonnelService;
    }

    @Autowired
    @Qualifier(value = "directoryFleetService")
    public void setDirectoryFleetService(DirectoryFleetService directoryFleetService) {
        this.directoryFleetService = directoryFleetService;
    }

    @Autowired
    @Qualifier(value = "directoryFlightPersonnelService")
    public void setDirectoryFlightPersonnelService(DirectoryFlightPersonnelService directoryFlightPersonnelService) {
        this.directoryFlightPersonnelService = directoryFlightPersonnelService;
    }

    @RequestMapping(value = "airports", method = RequestMethod.GET)
    public String listOfAirports(Model model) {
        model.addAttribute("directoryAirportsModel", new DirectoryAirportsModel());
        model.addAttribute("listAirports", this.directoryAirportsService.listOfAirports());

        return "airports";
    }

    @RequestMapping(value = "engineering", method = RequestMethod.GET)
    public String listOfEngineeringPersonnel(Model model) {
        model.addAttribute("directoryEngineeringPersonnelModel", new DirectoryEngineeringPersonnelModel());
        model.addAttribute("listEngineering", this.directoryEngineeringPersonnelService.listOfEngineers());

        return "engineering";
    }

    @RequestMapping(value = "fleet", method = RequestMethod.GET)
    public String listOfFleet(Model model) {
        model.addAttribute("directoryFleetModel", new DirectoryFleetModel());
        model.addAttribute("listFleet", this.directoryFleetService.listOfAircrafts());

        return "fleet";
    }

    @RequestMapping(value = "pilots", method = RequestMethod.GET)
    public String listOfFlightPersonnel(Model model) {
        model.addAttribute("directoryFlightPersonnelModel", new DirectoryFlightPersonnelModel());
        model.addAttribute("listPilots", this.directoryFlightPersonnelService.listOfPilots());

        return "pilots";
    }
}
