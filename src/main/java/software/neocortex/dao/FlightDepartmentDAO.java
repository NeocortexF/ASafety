package software.neocortex.dao;

import software.neocortex.model.FlightDepartmentData;

import java.util.List;

public interface FlightDepartmentDAO {

    void addFlightDepartmentData(FlightDepartmentData flightDepartmentData);

    void updateFlightDepartmentData(FlightDepartmentData flightDepartmentData);

    //FD не может удалять данные, пока не нужно
    //void removeFlightDepartmentData(FlightDepartmentData flightDepartmentData);

    FlightDepartmentData getFlightDepartmentDataById(int id);

    List<FlightDepartmentData> listFlightDepartmentData();

}
