package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.SingleEventFlightDepEngineerDAO;
import software.neocortex.model.SingleEventModelFlightDepEngineer;

@Repository
public class SingleEventFlightDepEngineerDaoImpl implements SingleEventFlightDepEngineerDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(singleEventModelFlightDepEngineer);
        logger.info("Data of Flight Department Engineer been successfully saved. Data details: " + singleEventModelFlightDepEngineer);
    }

    @Override
    public void updateSingleEventFlightDepEngineerData(SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(singleEventModelFlightDepEngineer);
        logger.info("Data of Flight Department Engineer been successfully updated. Data details: " + singleEventModelFlightDepEngineer);
    }

    @Override
    public SingleEventModelFlightDepEngineer getSingleEventFlightDepEngineerDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        SingleEventModelFlightDepEngineer singleEventModelFlightDepEngineer = (SingleEventModelFlightDepEngineer) session.load(SingleEventModelFlightDepEngineer.class, new Integer(id));
        logger.info("Data of Flight Department Engineer successfully loaded. Data details: " + singleEventModelFlightDepEngineer);

        return singleEventModelFlightDepEngineer;
    }
}
