package software.neocortex.dao;

import software.neocortex.model.SingleEventModelSafetyManager;

public interface SingleEventSafetyManagerDAO {

    void addSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager);

    void updateSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager);

    SingleEventModelSafetyManager getSingleEventSafetyManagerDataById(int id);
}
