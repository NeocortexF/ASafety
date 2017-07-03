package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.FlightProcessingDAO;
import software.neocortex.model.FlightProcessingData;

import java.util.List;

@Repository
public class FlightProcessingDaoImpl implements FlightProcessingDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addFlightProcessingData(FlightProcessingData flightProcessingData) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(flightProcessingData);
        logger.info("Data of flight processing engineering user been successfully saved. Data details: " + flightProcessingData);
    }

    @Override
    public void updateFlightProcessingData(FlightProcessingData flightProcessingData) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(flightProcessingData);
        logger.info("Data of flight processing engineering user been successfully updated. Data details: " + flightProcessingData);
    }

    @Override
    public void removeFlightProcessingData(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        FlightProcessingData flightProcessingData = (FlightProcessingData) session.load(FlightProcessingData.class, new Integer(id));

        if(flightProcessingData != null) {
            session.delete(flightProcessingData);
        }
        logger.info("Flight data successfully removed. Data details: " + flightProcessingData);
    }

    @Override
    public FlightProcessingData getFlightProcessingDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        FlightProcessingData flightProcessingData = (FlightProcessingData) session.load(FlightProcessingData.class, new Integer(id));
        logger.info("Data of flight processing engineering user successfully loaded. Data details: " + flightProcessingData);

        return flightProcessingData;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<FlightProcessingData> listFlightProcessingData() {
        Session session = this.sessionFactory.getCurrentSession();
        List<FlightProcessingData> flightProcessingDataList = session.createQuery("from FlightProcessingData").list();
        logger.info("Data from database was received successfully by flight processing engineering user");

        return flightProcessingDataList;
    }
}
