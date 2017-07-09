package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.DirectoryAirportsDAO;
import software.neocortex.model.DirectoryAirportsModel;

import java.util.List;

@Repository
public class DirectoryAirportsDaoImpl implements DirectoryAirportsDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAirport(DirectoryAirportsModel directoryAirportsModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(directoryAirportsModel);
        logger.info("Airport has been successfully saved. Airport details: " + directoryAirportsModel);
    }

    @Override
    public void updateAirport(DirectoryAirportsModel directoryAirportsModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(directoryAirportsModel);
        logger.info("Airport has been successfully updated. Airport details: " + directoryAirportsModel);
    }

    @Override
    public void removeAirport(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryAirportsModel directoryAirportsModel = (DirectoryAirportsModel) session.load(DirectoryAirportsModel.class, new Integer(id));

        if(directoryAirportsModel != null) {
            session.delete(directoryAirportsModel);
        }
        logger.info("Airport has been successfully removed. Airport details: " + directoryAirportsModel);
    }

    @Override
    public DirectoryAirportsModel getAirportById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryAirportsModel directoryAirportsModel = (DirectoryAirportsModel) session.load(DirectoryAirportsModel.class, new Integer(id));
        logger.info("Airport has been successfully loaded. Airport details: " + directoryAirportsModel);

        return directoryAirportsModel;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<DirectoryAirportsModel> listOfAirports() {
        Session session = this.sessionFactory.getCurrentSession();
        List<DirectoryAirportsModel> airportsList = session.createQuery("from DirectoryAirportsModel").list();
        logger.info("Airports list received successfully");

        return airportsList;
    }
}
