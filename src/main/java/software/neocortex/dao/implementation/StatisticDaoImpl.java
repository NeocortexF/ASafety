package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.StatisticDAO;
import software.neocortex.model.StatisticModel;

import java.util.List;

@Repository
public class StatisticDaoImpl implements StatisticDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<StatisticModel> listOfRisk() {
        Session session = this.sessionFactory.getCurrentSession();
        List<StatisticModel> listOfRisk = session.createQuery("SELECT Risk_index, COUNT(*) FROM flightdata GROUP BY Risk_index").list();
        logger.info("Data from database was received for risk statistics");
        System.out.println("------------------------------------------------------------------");
        System.out.println(listOfRisk.toString());

        return listOfRisk;
    }
}
