package software.neocortex.service;

import software.neocortex.model.DirectoryFlightPersonnelModel;

import java.util.List;

public interface DirectoryFlightPersonnelService {

    void addPilot(DirectoryFlightPersonnelModel directoryFlightPersonnelModel);

    void updatePilot(DirectoryFlightPersonnelModel directoryFlightPersonnelModel);

    void removePilot(int id);

    DirectoryFlightPersonnelModel getPilotById(int id);

    List<DirectoryFlightPersonnelModel> listOfPilots();

}
