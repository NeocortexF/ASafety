package software.neocortex.service;

import software.neocortex.model.SingleEventModelFlightChief;

public interface SingleEventFlightChiefService {

    void addSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief);

    void updateSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief);

    SingleEventModelFlightChief getSingleEventFlightChiefDataById(int id);
}
