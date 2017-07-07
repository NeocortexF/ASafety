package software.neocortex.service;

import software.neocortex.model.SingleEventModelSafetyManager;

public interface SingleEventSafetyManagerService {

    void addSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager);

    void updateSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager);

    SingleEventModelSafetyManager getSingleEventSafetyManagerDataById(int id);
}
