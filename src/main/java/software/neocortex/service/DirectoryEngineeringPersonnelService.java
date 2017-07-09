package software.neocortex.service;

import software.neocortex.model.DirectoryEngineeringPersonnelModel;

import java.util.List;

public interface DirectoryEngineeringPersonnelService {

    void addEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel);

    void updateEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel);

    void removeEngineer(int id);

    DirectoryEngineeringPersonnelModel getEngineerById(int id);

    List<DirectoryEngineeringPersonnelModel> listOfEngineers();
}
