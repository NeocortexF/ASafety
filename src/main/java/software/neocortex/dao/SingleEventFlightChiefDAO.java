package software.neocortex.dao;

import software.neocortex.model.SingleEventModelFlightChief;

public interface SingleEventFlightChiefDAO {

    void addSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief);

    void updateSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief);

    SingleEventModelFlightChief getSingleEventFlightChiefDataById(int id);
}
