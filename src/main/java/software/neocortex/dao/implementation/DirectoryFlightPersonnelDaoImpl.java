package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.DirectoryFlightPersonnelDAO;
import software.neocortex.model.DirectoryFlightPersonnelModel;

import java.util.List;

@Repository
public class DirectoryFlightPersonnelDaoImpl implements DirectoryFlightPersonnelDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPilot(DirectoryFlightPersonnelModel directoryFlightPersonnelModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(directoryFlightPersonnelModel);
        logger.info("Pilot has been successfully saved. Pilot details: " + directoryFlightPersonnelModel);
    }

    @Override
    public void updatePilot(DirectoryFlightPersonnelModel directoryFlightPersonnelModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(directoryFlightPersonnelModel);
        logger.info("Pilot has been successfully updated. Pilot details: " + directoryFlightPersonnelModel);
    }

    @Override
    public void removePilot(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryFlightPersonnelModel directoryFlightPersonnelModel = (DirectoryFlightPersonnelModel) session.load(DirectoryFlightPersonnelModel.class, new Integer(id));
        if(directoryFlightPersonnelModel != null) {
            session.delete(directoryFlightPersonnelModel);
        }
        logger.info("Pilot has been successfully deleted. Pilot details: " + directoryFlightPersonnelModel);
    }

    @Override
    public DirectoryFlightPersonnelModel getPilotById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryFlightPersonnelModel directoryFlightPersonnelModel = (DirectoryFlightPersonnelModel) session.load(DirectoryFlightPersonnelModel.class, new Integer(id));
        logger.info("Pilot has been successfully loaded. Pilot details: " + directoryFlightPersonnelModel);

        return directoryFlightPersonnelModel;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<DirectoryFlightPersonnelModel> listOfPilots() {
        Session session = this.sessionFactory.getCurrentSession();
        List<DirectoryFlightPersonnelModel> listOfPilots = session.createQuery("from DirectoryFlightPersonnelModel").list();
        logger.info("List of pilots received successfully");

        return listOfPilots;
    }
}
