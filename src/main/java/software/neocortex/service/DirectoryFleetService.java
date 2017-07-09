package software.neocortex.service;


import software.neocortex.model.DirectoryFleetModel;

import java.util.List;

public interface DirectoryFleetService {

    void addAircraft(DirectoryFleetModel directoryFleetModel);

    void updateAicraft(DirectoryFleetModel directoryFleetModel);

    void removeAicraft(int id);

    DirectoryFleetModel getAircraftById(int id);

    List<DirectoryFleetModel> listOfAircrafts();
}
