package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.SingleEventFlightChiefDAO;
import software.neocortex.model.SingleEventModelFlightChief;

@Repository
public class SingleEventFlightChiefDaoImpl implements SingleEventFlightChiefDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(singleEventModelFlightChief);
        logger.info("Data of Flight Chief been successfully saved. Data details: " + singleEventModelFlightChief);
    }

    @Override
    public void updateSingleEventFlightChiefData(SingleEventModelFlightChief singleEventModelFlightChief) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(singleEventModelFlightChief);
        logger.info("Data of Flight Chief been successfully updated. Data details: " + singleEventModelFlightChief);
    }

    @Override
    public SingleEventModelFlightChief getSingleEventFlightChiefDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        SingleEventModelFlightChief singleEventModelFlightChief = (SingleEventModelFlightChief) session.load(SingleEventModelFlightChief.class, new Integer(id));
        logger.info("Data of Flight Chief successfully loaded. Data details: " + singleEventModelFlightChief);

        return singleEventModelFlightChief;
    }
}
