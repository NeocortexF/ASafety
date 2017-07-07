package software.neocortex.service;

import software.neocortex.model.SingleEventModelFlightDepEngineer;

public interface SingleEventFlightDepEngineerService {

    void addSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer);

    void updateSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer);

    SingleEventModelFlightDepEngineer getSingleEventFlightDepEngineerDataById(int id);
}
