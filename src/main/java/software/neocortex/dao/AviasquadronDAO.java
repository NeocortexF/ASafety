package software.neocortex.dao;

import software.neocortex.model.AviasquadronData;

import java.util.List;

public interface AviasquadronDAO {

    void addAviasquadronData(AviasquadronData aviasquadronData);

    void updateAviasquadronData(AviasquadronData aviasquadronData);

    void removeAviasquadronData(int id);

    AviasquadronData getAviasquadronDataById(int id);

    List<AviasquadronData> listAviasquadronData();

}
