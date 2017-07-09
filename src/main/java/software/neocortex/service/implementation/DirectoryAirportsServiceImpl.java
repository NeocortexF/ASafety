package software.neocortex.service.implementation;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.DirectoryAirportsDAO;
import software.neocortex.model.DirectoryAirportsModel;
import software.neocortex.service.DirectoryAirportsService;

import java.util.List;

@Service
public class DirectoryAirportsServiceImpl implements DirectoryAirportsService {

    private DirectoryAirportsDAO directoryAirportsDAO;

    public void setDirectoryAirportsDAO(DirectoryAirportsDAO directoryAirportsDAO) {
        this.directoryAirportsDAO = directoryAirportsDAO;
    }

    @Override
    @Transactional
    public void addAirport(DirectoryAirportsModel directoryAirportsModel) {
        this.directoryAirportsDAO.addAirport(directoryAirportsModel);
    }

    @Override
    @Transactional
    public void updateAirport(DirectoryAirportsModel directoryAirportsModel) {
        this.directoryAirportsDAO.updateAirport(directoryAirportsModel);
    }

    @Override
    @Transactional
    public void removeAirport(int id) {
        this.directoryAirportsDAO.removeAirport(id);
    }

    @Override
    @Transactional
    public DirectoryAirportsModel getAirportById(int id) {
        return this.directoryAirportsDAO.getAirportById(id);
    }

    @Override
    @Transactional
    public List<DirectoryAirportsModel> listOfAirports() {
        return this.directoryAirportsDAO.listOfAirports();
    }
}
