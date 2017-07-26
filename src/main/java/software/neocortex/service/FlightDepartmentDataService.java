package software.neocortex.service;

import software.neocortex.model.FlightDepartmentData;

import java.util.List;

public interface FlightDepartmentDataService {

    void addFlightDepartmentData(FlightDepartmentData flightDepartmentData);

    void updateFlightDepartmentData(FlightDepartmentData flightDepartmentData);

    void removeFlightDepartmentData(int id);

    FlightDepartmentData getFlightDepartmentDataById(int id);

    List<FlightDepartmentData> listFlightDepartmentData();

}
