package software.neocortex.dao;

import software.neocortex.model.SingleProcessingModel;

import java.util.List;

public interface SingleProcessingDAO {

    void addSingleProcessingData(SingleProcessingModel singleProcessingModel);

    void updateSingleProcessingData(SingleProcessingModel singleProcessingModel);

    void removeSingleProcessingData(int id);

    SingleProcessingModel getSingleProcessingDataById(int id);

    List<SingleProcessingModel> listSingleProcessingData();
}
