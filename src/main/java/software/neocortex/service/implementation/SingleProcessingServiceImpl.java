package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.SingleProcessingDAO;
import software.neocortex.model.SingleProcessingModel;
import software.neocortex.service.SingleProcessingService;

import java.util.List;

@Service
public class SingleProcessingServiceImpl implements SingleProcessingService {

    private SingleProcessingDAO singleProcessingDAO;

    public void setSingleProcessingDAO(SingleProcessingDAO singleProcessingDAO) {
        this.singleProcessingDAO = singleProcessingDAO;
    }

    @Override
    @Transactional
    public void addSingleProcessingData(SingleProcessingModel singleProcessingModel) {
        this.singleProcessingDAO.addSingleProcessingData(singleProcessingModel);
    }

    @Override
    @Transactional
    public void updateSingleProcessingData(SingleProcessingModel singleProcessingModel) {
        this.singleProcessingDAO.updateSingleProcessingData(singleProcessingModel);
    }

    @Override
    @Transactional
    public void removeSingleProcessingData(int id) {
        this.singleProcessingDAO.removeSingleProcessingData(id);
    }

    @Override
    @Transactional
    public SingleProcessingModel getSingleProcessingDataById(int id) {
        return this.singleProcessingDAO.getSingleProcessingDataById(id);
    }

    @Transactional
    public List<SingleProcessingModel> listSingleProcessingData() {
        return this.singleProcessingDAO.listSingleProcessingData();
    }
}
