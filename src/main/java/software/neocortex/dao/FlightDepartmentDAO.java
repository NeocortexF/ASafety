package software.neocortex.dao;

import software.neocortex.model.FlightDepartmentData;

import java.util.List;

public interface FlightDepartmentDAO {

    void addFlightDepartmentData(FlightDepartmentData flightDepartmentData);

    void updateFlightDepartmentData(FlightDepartmentData flightDepartmentData);

    void removeFlightDepartmentData(int id);

    FlightDepartmentData getFlightDepartmentDataById(int id);

    List<FlightDepartmentData> listFlightDepartmentData();

}
