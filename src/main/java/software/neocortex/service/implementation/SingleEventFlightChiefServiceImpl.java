package software.neocortex.service.implementation;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.SingleEventFlightChiefDAO;
import software.neocortex.model.SingleEventModelFlightChief;
import software.neocortex.service.SingleEventFlightChiefService;

@Service
public class SingleEventFlightChiefServiceImpl implements SingleEventFlightChiefService {

    private SingleEventFlightChiefDAO singleEventFlightChiefDAO;

    public void setSingleEventFlightChiefDAO(SingleEventFlightChiefDAO singleEventFlightChiefDAO) {
        this.singleEventFlightChiefDAO = singleEventFlightChiefDAO;
    }

    @Override
    @Transactional
    public void addSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief) {
        this.singleEventFlightChiefDAO.addSingleEventFlightChiefData(singleEventModelFlightChief);
    }

    @Override
    @Transactional
    public void updateSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief) {
        this.singleEventFlightChiefDAO.updateSingleEventFlightChiefData(singleEventModelFlightChief);
    }

    @Override
    @Transactional
    public SingleEventModelFlightChief getSingleEventFlightChiefDataById(int id) {
        return this.singleEventFlightChiefDAO.getSingleEventFlightChiefDataById(id);
    }
}
