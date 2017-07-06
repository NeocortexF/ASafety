package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.SingleEventSafetyManagerDAO;
import software.neocortex.model.SingleEventModelSafetyManager;

@Repository
public class SingleEventSafetyManagerDaoImpl implements SingleEventSafetyManagerDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(singleEventModelSafetyManager);
        logger.info("Data of Safety Manager successfully saved. Data details: " + singleEventModelSafetyManager);
    }

    @Override
    public void updateSingleEventSafetyManagerData(SingleEventModelSafetyManager singleEventModelSafetyManager) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(singleEventModelSafetyManager);
        logger.info("Data of Safety Manager user been successfully updated. Data details: " + singleEventModelSafetyManager);
    }

    @Override
    public SingleEventModelSafetyManager getSingleEventSafetyManagerDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        SingleEventModelSafetyManager singleEventModelSafetyManager = (SingleEventModelSafetyManager) session.load(SingleEventModelSafetyManager.class , new Integer(id));
        logger.info("Data of Safety Manager user successfully loaded. Data details: " + singleEventModelSafetyManager);

        return singleEventModelSafetyManager;
    }

}
