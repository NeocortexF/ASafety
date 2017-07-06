package software.neocortex.dao;

import software.neocortex.model.SingleSquadronModel;

public interface SingleSquadronDAO {

    void addSingleSquadronData(SingleSquadronModel singleSquadronModel);

    void updateSingleSquadronData(SingleSquadronModel singleSquadronModel);

    SingleSquadronModel getSingleSquadronDataById(int id);
}
