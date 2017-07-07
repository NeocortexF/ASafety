package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.SingleEventFlightDepEngineerDAO;
import software.neocortex.model.SingleEventModelFlightDepEngineer;
import software.neocortex.service.SingleEventFlightDepEngineerService;

@Service
public class SingleEventFlightDepEngineerServiceImpl implements SingleEventFlightDepEngineerService {

    private SingleEventFlightDepEngineerDAO singleEventFlightDepEngineerDAO;

    public void setSingleEventFlightDepEngineerDAO(SingleEventFlightDepEngineerDAO singleEventFlightDepEngineerDAO) {
        this.singleEventFlightDepEngineerDAO = singleEventFlightDepEngineerDAO;
    }

    @Override
    @Transactional
    public void addSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer) {
        this.singleEventFlightDepEngineerDAO.addSingleEventFlightDepEngineerData(singleEventModelFlightDepEngineer);
    }

    @Override
    @Transactional
    public void updateSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer) {
        this.singleEventFlightDepEngineerDAO.updateSingleEventFlightDepEngineerData(singleEventModelFlightDepEngineer);
    }

    @Override
    @Transactional
    public SingleEventModelFlightDepEngineer getSingleEventFlightDepEngineerDataById(int id) {
        return this.singleEventFlightDepEngineerDAO.getSingleEventFlightDepEngineerDataById(id);
    }
}
