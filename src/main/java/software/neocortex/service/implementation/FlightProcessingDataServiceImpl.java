package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.FlightProcessingDAO;
import software.neocortex.model.FlightProcessingData;
import software.neocortex.service.FlightProcessingDataService;

import java.util.List;

@Service
public class FlightProcessingDataServiceImpl implements FlightProcessingDataService {

    private FlightProcessingDAO flightProcessingDAO;

    public void setFlightProcessingDAO(FlightProcessingDAO flightProcessingDAO) {
        this.flightProcessingDAO = flightProcessingDAO;
    }

    @Override
    @Transactional
    public void addFlightProcessingData(FlightProcessingData flightProcessingData) {
        this.flightProcessingDAO.addFlightProcessingData(flightProcessingData);
    }

    @Override
    @Transactional
    public void updateFlightProcessingData(FlightProcessingData flightProcessingData) {
        this.flightProcessingDAO.updateFlightProcessingData(flightProcessingData);

    }

    @Override
    @Transactional
    public void removeFlightProcessingData(int id) {
        this.flightProcessingDAO.removeFlightProcessingData(id);

    }

    @Override
    @Transactional
    public FlightProcessingData getFlightProcessingDataById(int id) {
        return this.flightProcessingDAO.getFlightProcessingDataById(id);
    }

    @Override
    @Transactional
    public List<FlightProcessingData> listFlightProcessingData() {
        return this.flightProcessingDAO.listFlightProcessingData();
    }
}
