package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.SingleSquadronDAO;
import software.neocortex.model.SingleSquadronModel;

@Repository
public class SingleSquadronDaoImpl implements SingleSquadronDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addSingleSquadronData(SingleSquadronModel singleSquadronModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(singleSquadronModel);
        logger.info("Data of air squadron user been successfully saved. Data details: " + singleSquadronModel);
    }

    @Override
    public void updateSingleSquadronData(SingleSquadronModel singleSquadronModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(singleSquadronModel);
        logger.info("Data of air squadron user been successfully updated. Data details: " + singleSquadronModel);
    }

    @Override
    public SingleSquadronModel getSingleSquadronDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        SingleSquadronModel singleSquadronModel = (SingleSquadronModel) session.load(SingleSquadronModel.class, new Integer(id));
        logger.info("Data of air squadron user successfully loaded. Data details: " + singleSquadronModel);

        return singleSquadronModel;
    }
}
