package software.neocortex.dao;

import software.neocortex.model.DirectoryEngineeringPersonnelModel;

import java.util.List;

public interface DirectoryEngineeringPersonnelDAO {

    void addEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel);

    void updateEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel);

    void removeEngineer(int id);

    DirectoryEngineeringPersonnelModel getEngineerById(int id);

    List<DirectoryEngineeringPersonnelModel> listOfEngineers();
}
