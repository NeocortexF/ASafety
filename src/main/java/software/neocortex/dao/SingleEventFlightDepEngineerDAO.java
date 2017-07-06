package software.neocortex.dao;

import software.neocortex.model.SingleEventModelFlightDepEngineer;

public interface SingleEventFlightDepEngineerDAO {

    void addSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer);

    void updateSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer);

    SingleEventModelFlightDepEngineer getSingleEventFlightDepEngineerDataById(int id);
}
