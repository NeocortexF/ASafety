package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.SingleSquadronDAO;
import software.neocortex.model.SingleSquadronModel;
import software.neocortex.service.SingleSquadronService;

@Service
public class SingleSquadronServiceImpl implements SingleSquadronService {

    private SingleSquadronDAO singleSquadronDAO;

    public void setSingleSquadronDAO(SingleSquadronDAO singleSquadronDAO) {
        this.singleSquadronDAO = singleSquadronDAO;
    }

    @Override
    @Transactional
    public void addSingleSquadronData(SingleSquadronModel singleSquadronModel) {
        this.singleSquadronDAO.addSingleSquadronData(singleSquadronModel);
    }

    @Override
    @Transactional
    public void updateSingleSquadronData(SingleSquadronModel singleSquadronModel) {
        this.singleSquadronDAO.updateSingleSquadronData(singleSquadronModel);
    }

    @Override
    @Transactional
    public SingleSquadronModel getSingleSquadronDataById(int id) {
        return this.singleSquadronDAO.getSingleSquadronDataById(id);
    }
}
