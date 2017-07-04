package software.neocortex.service;

import software.neocortex.model.FlightProcessingData;

import java.util.List;

public interface FlightProcessingDataService {

    void addFlightProcessingData(FlightProcessingData flightProcessingData);

    void updateFlightProcessingData(FlightProcessingData flightProcessingData);

    void removeFlightProcessingData(int id);

    FlightProcessingData getFlightProcessingDataById(int id);

    List<FlightProcessingData> listFlightProcessingData();
}
