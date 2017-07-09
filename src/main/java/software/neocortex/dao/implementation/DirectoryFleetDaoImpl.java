package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.DirectoryFleetDAO;
import software.neocortex.model.DirectoryFleetModel;

import java.util.List;

@Repository
public class DirectoryFleetDaoImpl implements DirectoryFleetDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAircraft(DirectoryFleetModel directoryFleetModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(directoryFleetModel);
        logger.info("Aircraft has been successfully saved. Aircraft details: " + directoryFleetModel);
    }

    @Override
    public void updateAircraft(DirectoryFleetModel directoryFleetModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(directoryFleetModel);
        logger.info("Aircraft has been successfully updated. Aircraft details: " + directoryFleetModel);
    }

    @Override
    public void removeAircraft(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryFleetModel directoryFleetModel = (DirectoryFleetModel) session.load(DirectoryFleetModel.class, new Integer(id));

        if(directoryFleetModel != null) {
            session.delete(directoryFleetModel);
        }
        logger.info("Aircraft has been successfully deleted. Aircraft details: " + directoryFleetModel);
    }

    @Override
    public DirectoryFleetModel getAircraftById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryFleetModel directoryFleetModel = (DirectoryFleetModel) session.load(DirectoryFleetModel.class, new Integer(id));
        logger.info("Aircraft has been successfully loaded. Aircraft details: " + directoryFleetModel);

        return directoryFleetModel;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<DirectoryFleetModel> listOfAircrafts() {
        Session session = this.sessionFactory.getCurrentSession();
        List<DirectoryFleetModel> listOfAircrafts = session.createQuery("from DirectoryFleetModel").list();
        logger.info("Aircraft list successfully received");

        return listOfAircrafts;
    }
}
