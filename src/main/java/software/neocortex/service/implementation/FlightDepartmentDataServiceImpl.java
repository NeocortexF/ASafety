package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.FlightDepartmentDAO;
import software.neocortex.model.FlightDepartmentData;
import software.neocortex.service.FlightDepartmentDataService;

import java.util.List;

@Service
public class FlightDepartmentDataServiceImpl implements FlightDepartmentDataService {

    private FlightDepartmentDAO flightDepartmentDAO;

    public void setFlightDepartmentDAO(FlightDepartmentDAO flightDepartmentDAO) {
        this.flightDepartmentDAO = flightDepartmentDAO;
    }

    @Override
    @Transactional
    public void addFlightDepartmentData(FlightDepartmentData flightDepartmentData) {
        this.flightDepartmentDAO.addFlightDepartmentData(flightDepartmentData);
    }

    @Override
    @Transactional
    public void updateFlightDepartmentData(FlightDepartmentData flightDepartmentData) {
        this.flightDepartmentDAO.updateFlightDepartmentData(flightDepartmentData);
    }

    @Override
    @Transactional
    public void removeFlightDepartmentData(int id) {
        this.flightDepartmentDAO.removeFlightDepartmentData(id);
    }

    @Override
    @Transactional
    public FlightDepartmentData getFlightDepartmentDataById(int id) {
        return this.flightDepartmentDAO.getFlightDepartmentDataById(id);
    }

    @Override
    @Transactional
    public List<FlightDepartmentData> listFlightDepartmentData() {
        return this.flightDepartmentDAO.listFlightDepartmentData();
    }
}
