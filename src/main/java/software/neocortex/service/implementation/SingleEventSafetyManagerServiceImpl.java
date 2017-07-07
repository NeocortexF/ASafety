package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.SingleEventSafetyManagerDAO;
import software.neocortex.model.SingleEventModelSafetyManager;
import software.neocortex.service.SingleEventSafetyManagerService;

@Service
public class SingleEventSafetyManagerServiceImpl implements SingleEventSafetyManagerService {

    private SingleEventSafetyManagerDAO singleEventSafetyManagerDAO;

    public void setSingleEventSafetyManagerDAO(SingleEventSafetyManagerDAO singleEventSafetyManagerDAO) {
        this.singleEventSafetyManagerDAO = singleEventSafetyManagerDAO;
    }

    @Override
    @Transactional
    public void addSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager) {
        this.singleEventSafetyManagerDAO.addSingleEventSafetyManagerData(singleEventModelSafetyManager);
    }

    @Override
    @Transactional
    public void updateSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager) {
        this.singleEventSafetyManagerDAO.updateSingleEventSafetyManagerData(singleEventModelSafetyManager);
    }

    @Override
    @Transactional
    public SingleEventModelSafetyManager getSingleEventSafetyManagerDataById(int id) {
        return this.singleEventSafetyManagerDAO.getSingleEventSafetyManagerDataById(id);
    }
}
