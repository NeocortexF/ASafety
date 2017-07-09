package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.DirectoryFlightPersonnelDAO;
import software.neocortex.model.DirectoryFlightPersonnelModel;
import software.neocortex.service.DirectoryFlightPersonnelService;

import java.util.List;

@Service
public class DirectoryFlightPersonnelServiceImpl implements DirectoryFlightPersonnelService {

    private DirectoryFlightPersonnelDAO  directoryFlightPersonnelDAO;

    public void setDirectoryFlightPersonnelDAO(DirectoryFlightPersonnelDAO directoryFlightPersonnelDAO) {
        this.directoryFlightPersonnelDAO = directoryFlightPersonnelDAO;
    }

    @Override
    @Transactional
    public void addPilot(DirectoryFlightPersonnelModel directoryFlightPersonnelModel) {
        this.directoryFlightPersonnelDAO.addPilot(directoryFlightPersonnelModel);
    }

    @Override
    @Transactional
    public void updatePilot(DirectoryFlightPersonnelModel directoryFlightPersonnelModel) {
        this.directoryFlightPersonnelDAO.updatePilot(directoryFlightPersonnelModel);
    }

    @Override
    @Transactional
    public void removePilot(int id) {
        this.directoryFlightPersonnelDAO.removePilot(id);
    }

    @Override
    @Transactional
    public DirectoryFlightPersonnelModel getPilotById(int id) {
        return this.directoryFlightPersonnelDAO.getPilotById(id);
    }

    @Override
    @Transactional
    public List<DirectoryFlightPersonnelModel> listOfPilots() {
        return this.directoryFlightPersonnelDAO.listOfPilots();
    }
}
