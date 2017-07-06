package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.SingleProcessingDAO;
import software.neocortex.model.SingleProcessingModel;

import java.util.List;

@Repository
public class SingleProcessingDaoImpl implements SingleProcessingDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addSingleProcessingData(SingleProcessingModel singleProcessingModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(singleProcessingModel);
        logger.info("Data of Flight Data Processing Engineering user been successfully saved. Data details: " + singleProcessingModel);
    }

    @Override
    public void updateSingleProcessingData(SingleProcessingModel singleProcessingModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(singleProcessingModel);
        logger.info("Data of Flight Data Processing Engineering user been successfully updated. Data details: " + singleProcessingModel);
    }

    @Override
    public void removeSingleProcessingData(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        SingleProcessingModel singleProcessingModel = (SingleProcessingModel) session.load(SingleProcessingModel.class, new Integer(id));
        if(singleProcessingModel != null) {
          session.delete(singleProcessingModel);
        }
        logger.info("Data of Flight Data Processing Engineering was deleted. Data details: " + singleProcessingModel);
    }

    @Override
    public SingleProcessingModel getSingleProcessingDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        SingleProcessingModel singleProcessingModel = (SingleProcessingModel) session.load(SingleProcessingModel.class, new Integer(id));
        logger.info("Data of Flight Data Processing Engineering user been successfully loaded. Data details: " + singleProcessingModel);

        return singleProcessingModel;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SingleProcessingModel> listSingleProcessingData() {
        Session session = this.sessionFactory.getCurrentSession();
        List<SingleProcessingModel> singleProcessingDataList = session.createQuery("from SingleProcessingModel").list();
        logger.info("Data from database was received successfully by Flight Data Processing Engineering user");

        return null;
    }
}
