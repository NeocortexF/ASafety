package software.neocortex.service;

import software.neocortex.model.DirectoryAirportsModel;

import java.util.List;

public interface DirectoryAirportsService {

    void addAirport(DirectoryAirportsModel directoryAirportsModel);

    void updateAirport(DirectoryAirportsModel directoryAirportsModel);

    void removeAirport(int id);

    DirectoryAirportsModel getAirportById(int id);

    List<DirectoryAirportsModel> listOfAirports();
}
