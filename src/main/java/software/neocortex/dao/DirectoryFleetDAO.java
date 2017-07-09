package software.neocortex.dao;


import software.neocortex.model.DirectoryFleetModel;

import java.util.List;

public interface DirectoryFleetDAO {

    void addAircraft(DirectoryFleetModel directoryFleetModel);

    void updateAircraft(DirectoryFleetModel directoryFleetModel);

    void removeAircraft(int id);

    DirectoryFleetModel getAircraftById(int id);

    List<DirectoryFleetModel> listOfAircrafts();
}
