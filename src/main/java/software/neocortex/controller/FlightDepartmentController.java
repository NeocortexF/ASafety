package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import software.neocortex.model.FlightDepartmentData;
import software.neocortex.service.FlightDepartmentDataService;

@Controller
public class FlightDepartmentController {
    private FlightDepartmentDataService flightDepartmentDataService;

    @Autowired
    @Qualifier(value = "flightDepartmentDataService")
    public void setFlightDepartmentDataService(FlightDepartmentDataService flightDepartmentDataService) {
        this.flightDepartmentDataService = flightDepartmentDataService;
    }

    @RequestMapping(value = "flightdata", method = RequestMethod.GET)
    public String listFlightDepartmentData(Model model) {
        model.addAttribute("flightDepartmentData", new FlightDepartmentData());
        model.addAttribute("listFlightDepartmentData", this.flightDepartmentDataService.listFlightDepartmentData());

        return "flightdata";
    }

    @RequestMapping(value = "/flightdata/add", method = RequestMethod.POST)
    public String addFlightDepartmentData(@ModelAttribute("flightDepartmentData") FlightDepartmentData flightDepartmentData) {
        if(flightDepartmentData.getId() == 0) {
            this.flightDepartmentDataService.addFlightDepartmentData(flightDepartmentData);
        } else {
            this.flightDepartmentDataService.updateFlightDepartmentData(flightDepartmentData);
        }

        return "redirect:/flightdata";
    }

    @RequestMapping("edit/{id}")
    public String editFlightDepartmentData(@PathVariable("id") int id, Model model) {
        model.addAttribute("flightDepartmentData", this.flightDepartmentDataService.getFlightDepartmentDataById(id));
        model.addAttribute("listFlightDepartmentData", this.flightDepartmentDataService.listFlightDepartmentData());

        return "flightdata";
    }

    @RequestMapping("fdinfo/{id}")
    public String flightDataInfo(@PathVariable("id") int id, Model model) {
        model.addAttribute("flightDepartmentData", this.flightDepartmentDataService.getFlightDepartmentDataById(id));

        return "fdinfo";
    }
}
