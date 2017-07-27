package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import software.neocortex.model.StatisticModel;
import software.neocortex.service.StatisticService;

@Controller
public class StatisticController {

    private StatisticService statisticService;

    @Autowired
    @Qualifier(value = "statisticService")
    public void setStatisticService(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    @RequestMapping(value = "chart", method = RequestMethod.GET)
    public String listOfRisks(Model model) {
        model.addAttribute("statisticModel", new StatisticModel());
        model.addAttribute("listRisks", this.statisticService.listOfRisks());

        return "chart";
    }
}
