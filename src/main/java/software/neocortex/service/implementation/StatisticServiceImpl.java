package software.neocortex.service.implementation;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.StatisticDAO;
import software.neocortex.model.StatisticModel;
import software.neocortex.service.StatisticService;

import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    private StatisticDAO statisticDAO;

    public void setStatisticDAO(StatisticDAO statisticDAO) {
        this.statisticDAO = statisticDAO;
    }

    @Override
    @Transactional
    public List<StatisticModel> listOfRisks() {
        return this.statisticDAO.listOfRisk();
    }
}
