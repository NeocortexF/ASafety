package software.neocortex.service;

import software.neocortex.model.SingleSquadronModel;

public interface SingleSquadronService {

    void addSingleSquadronData(SingleSquadronModel singleSquadronModel);

    void updateSingleSquadronData(SingleSquadronModel singleSquadronModel);

    SingleSquadronModel getSingleSquadronDataById(int id);
}
