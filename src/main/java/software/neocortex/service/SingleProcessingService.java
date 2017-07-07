package software.neocortex.service;

import software.neocortex.model.SingleProcessingModel;

import java.util.List;

public interface SingleProcessingService {

    void addSingleProcessingData(SingleProcessingModel singleProcessingModel);

    void updateSingleProcessingData(SingleProcessingModel singleProcessingModel);

    void removeSingleProcessingData(int id);

    SingleProcessingModel getSingleProcessingDataById(int id);

    List<SingleProcessingModel> listSingleProcessingData();
}
