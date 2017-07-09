package software.neocortex.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.DirectoryEngineeringPersonnelDAO;
import software.neocortex.model.DirectoryEngineeringPersonnelModel;

import java.util.List;

@Repository
public class DirectoryEngineeringPersonnelDaoImpl implements DirectoryEngineeringPersonnelDAO {

    private static final Logger logger = LoggerFactory.getLogger(FlightDepartmentDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(directoryEngineeringPersonnelModel);
        logger.info("Engineer has been successfully saved. Engineer details: " + directoryEngineeringPersonnelModel);
    }

    @Override
    public void updateEngineer(DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(directoryEngineeringPersonnelModel);
        logger.info("Engineer has been successfully updated. Engineer details: " + directoryEngineeringPersonnelModel);
    }

    @Override
    public void removeEngineer(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel = (DirectoryEngineeringPersonnelModel) session.load(DirectoryEngineeringPersonnelModel.class, new Integer(id));

        if(directoryEngineeringPersonnelModel != null) {
            session.delete(directoryEngineeringPersonnelModel);
        }
        logger.info("Engineer has been successfully deleted. Engineer details: " + directoryEngineeringPersonnelModel);
    }

    @Override
    public DirectoryEngineeringPersonnelModel getEngineerById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        DirectoryEngineeringPersonnelModel directoryEngineeringPersonnelModel = (DirectoryEngineeringPersonnelModel) session.load(DirectoryEngineeringPersonnelModel.class, new Integer(id));
        logger.info("Engineer has been successfully loaded. Engineer details: " + directoryEngineeringPersonnelModel);

        return directoryEngineeringPersonnelModel;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<DirectoryEngineeringPersonnelModel> listOfEngineers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<DirectoryEngineeringPersonnelModel> listOfEngineers = session.createQuery("from DirectoryEngineeringPersonnelModel").list();

        return listOfEngineers;
    }
}
