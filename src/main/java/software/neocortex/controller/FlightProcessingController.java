package software.neocortex.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import software.neocortex.model.FlightProcessingData;
import software.neocortex.service.FlightProcessingDataService;

@Controller
public class FlightProcessingController {
    private FlightProcessingDataService flightProcessingDataService;

    @Autowired
    @Qualifier(value = "flightProcessingDataService")
    public void setFlightProcessingDataService(FlightProcessingDataService flightProcessingDataService) {
        this.flightProcessingDataService = flightProcessingDataService;
    }

    @RequestMapping(value = "processdata", method = RequestMethod.GET)
    public String listFlightProcessingData(Model model) {
        model.addAttribute("flightProcessingData", new FlightProcessingData());
        model.addAttribute("listFlightProcessingData", this.flightProcessingDataService.listFlightProcessingData());

        return "processdata";
    }

    @RequestMapping(value = "/processdata/add", method = RequestMethod.POST)
    public String addFlightProcessingData(@ModelAttribute("flightProcessingData") FlightProcessingData flightProcessingData) {
        if (flightProcessingData.getId() == 0) {
            this.flightProcessingDataService.addFlightProcessingData(flightProcessingData);
        } else {
            this.flightProcessingDataService.updateFlightProcessingData(flightProcessingData);
        }

        return "redirect:/processdata";
    }

    @RequestMapping(value = "processremove/{id}")
    public String removeFlightProcessingData(@PathVariable("id") int id) {
        this.flightProcessingDataService.removeFlightProcessingData(id);

        return "redirect:/processdata";
    }

    @RequestMapping(value = "processedit/{id}")
    public String editFlightProcessingData(@PathVariable("id") int id, Model model) {
        model.addAttribute("flightProcessingData", this.flightProcessingDataService.getFlightProcessingDataById(id));
        model.addAttribute("listFlightProcessingData", this.flightProcessingDataService.listFlightProcessingData());

        return "processdata";
    }

    @RequestMapping(value = "processinfo/{id}")
    public String flightProcessingDataInfo(@PathVariable("id") int id, Model model) {
        model.addAttribute("flightProcessingData", this.flightProcessingDataService.getFlightProcessingDataById(id));

        return "processinfo";
    }

}
