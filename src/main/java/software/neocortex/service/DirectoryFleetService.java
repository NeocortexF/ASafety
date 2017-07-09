package software.neocortex.service;


import software.neocortex.model.DirectoryFleetModel;

import java.util.List;

public interface DirectoryFleetService {

    void addAircraft(DirectoryFleetModel directoryFleetModel);

    void updateAircraft(DirectoryFleetModel directoryFleetModel);

    void removeAircraft(int id);

    DirectoryFleetModel getAircraftById(int id);

    List<DirectoryFleetModel> listOfAircrafts();
}
