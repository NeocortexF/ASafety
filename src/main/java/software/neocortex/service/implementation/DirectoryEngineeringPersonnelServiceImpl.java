package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.DirectoryEngineeringPersonnelDAO;
import software.neocortex.model.DirectoryEngineeringPersonnelModel;
import software.neocortex.service.DirectoryEngineeringPersonnelService;

import java.util.List;

@Service
public class DirectoryEngineeringPersonnelServiceImpl implements DirectoryEngineeringPersonnelService {

    private DirectoryEngineeringPersonnelDAO directoryEngineeringPersonnelDAO;

    public void setDirectoryEngineeringPersonnelDAO(DirectoryEngineeringPersonnelDAO directoryEngineeringPersonnelDAO) {
        this.directoryEngineeringPersonnelDAO = directoryEngineeringPersonnelDAO;
    }

    @Override
    @Transactional
    public void addEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel) {
        this.directoryEngineeringPersonnelDAO.addEngineer(directoryEngineeringPersonnelModel);
    }

    @Override
    @Transactional
    public void updateEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel) {
        this.directoryEngineeringPersonnelDAO.updateEngineer(directoryEngineeringPersonnelModel);
    }

    @Override
    @Transactional
    public void removeEngineer(int id) {
        this.directoryEngineeringPersonnelDAO.removeEngineer(id);
    }

    @Override
    @Transactional
    public DirectoryEngineeringPersonnelModel getEngineerById(int id) {
        return this.directoryEngineeringPersonnelDAO.getEngineerById(id);
    }

    @Override
    @Transactional
    public List<DirectoryEngineeringPersonnelModel> listOfEngineers() {
        return this.directoryEngineeringPersonnelDAO.listOfEngineers();
    }
}
