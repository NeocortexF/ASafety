package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.neocortex.dao.FlightDepartmentDAO;
import software.neocortex.model.FlightDepartmentData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightDepartmentDaoImpl implements FlightDepartmentDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addFlightDepartmentData(FlightDepartmentData flightDepartmentData) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(flightDepartmentData);
        logger.info("Data of flight department user been successfully saved. Data details: " + flightDepartmentData);
    }

    @Override
    public void updateFlightDepartmentData(FlightDepartmentData flightDepartmentData) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(flightDepartmentData);
        logger.info("Data of flight department user successfully updated. Data details: " + flightDepartmentData);

    }

    @Override
    public void removeFlightDepartmentData(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        FlightDepartmentData flightDepartmentData = (FlightDepartmentData) session.load(FlightDepartmentData.class, new Integer(id));

        if(flightDepartmentData != null) {
            session.delete(flightDepartmentData);
        }
        logger.info("Flight data successfully removed. Data details: " + flightDepartmentData);
    }

    @Override
    public FlightDepartmentData getFlightDepartmentDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        FlightDepartmentData flightDepartmentData = (FlightDepartmentData) session.load(FlightDepartmentData.class, new Integer(id));
        logger.info("Data of flight department user successfully loaded. Data details: " + flightDepartmentData);

        return flightDepartmentData;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<FlightDepartmentData> listFlightDepartmentData() {
        Session session = this.sessionFactory.getCurrentSession();
        List<FlightDepartmentData> flightDepartmentDataList = session.createQuery("from FlightDepartmentData").list();
        logger.info("Data from database was received successfully by flight department user");

        return flightDepartmentDataList;
    }
}
