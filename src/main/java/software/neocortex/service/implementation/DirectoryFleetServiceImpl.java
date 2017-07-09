package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.DirectoryFleetDAO;
import software.neocortex.model.DirectoryFleetModel;
import software.neocortex.service.DirectoryFleetService;

import java.util.List;

@Service
public class DirectoryFleetServiceImpl implements DirectoryFleetService {

    private DirectoryFleetDAO directoryFleetDAO;

    public void setDirectoryFleetDAO(DirectoryFleetDAO directoryFleetDAO) {
        this.directoryFleetDAO = directoryFleetDAO;
    }

    @Override
    @Transactional
    public void addAircraft(DirectoryFleetModel directoryFleetModel) {
        this.directoryFleetDAO.addAircraft(directoryFleetModel);
    }

    @Override
    @Transactional
    public void updateAircraft(DirectoryFleetModel directoryFleetModel) {
        this.directoryFleetDAO.updateAircraft(directoryFleetModel);
    }

    @Override
    @Transactional
    public void removeAircraft(int id) {
        this.directoryFleetDAO.removeAircraft(id);
    }

    @Override
    @Transactional
    public DirectoryFleetModel getAircraftById(int id) {
        return this.directoryFleetDAO.getAircraftById(id);
    }

    @Override
    @Transactional
    public List<DirectoryFleetModel> listOfAircrafts() {
        return this.directoryFleetDAO.listOfAircrafts();
    }
}
