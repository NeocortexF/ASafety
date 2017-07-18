package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.AviasquadronDAO;
import software.neocortex.model.AviasquadronData;

import java.util.List;

@Repository
public class AviasquadronDaoImpl implements AviasquadronDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAviasquadronData(AviasquadronData aviasquadronData) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(aviasquadronData);
        logger.info("Data of Aviasquadron user been successfully saved. Data details: " + aviasquadronData);
    }

    @Override
    public void updateAviasquadronData(AviasquadronData aviasquadronData) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(aviasquadronData);
        logger.info("Data of Aviasquadron user successfully updated. Data details: " + aviasquadronData);

    }

    @Override
    public AviasquadronData getAviasquadronDataById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        AviasquadronData aviasquadronData = (AviasquadronData) session.load(AviasquadronData.class, new Integer(id));
        logger.info("Data of Aviasquadron user successfully loaded. Data details: " + aviasquadronData);

        return aviasquadronData;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<AviasquadronData> listAviasquadronData() {
        Session session = this.sessionFactory.getCurrentSession();
        List<AviasquadronData> aviasquadronDataList = session.createQuery("from AviasquadronData").list();
        logger.info("Data from database was received successfully by Aviasquadron user");

        return aviasquadronDataList;
    }
}
