package software.neocortex.service.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.AviasquadronDAO;
import software.neocortex.model.AviasquadronData;
import software.neocortex.service.AviasquadronDataService;

import java.util.List;

@Service
public class AviasquandronDataServiceImpl implements AviasquadronDataService {

    private AviasquadronDAO aviasquadronDAO;

    public void setAviasquadronDAO(AviasquadronDAO aviasquadronDAO) {
        this.aviasquadronDAO = aviasquadronDAO;
    }

    @Override
    @Transactional
    public void addAviasquadronData(AviasquadronData aviasquadronData) {
        this.aviasquadronDAO.addAviasquadronData(aviasquadronData);
    }

    @Override
    @Transactional
    public void updateAviasquadronData(AviasquadronData aviasquadronData) {
        this.aviasquadronDAO.updateAviasquadronData(aviasquadronData);

    }

    @Override
    @Transactional
    public AviasquadronData getAviasquadronDataById(int id) {
        return this.aviasquadronDAO.getAviasquadronDataById(id);
    }

    @Override
    @Transactional
    public List<AviasquadronData> listAviasquadronData() {
        return this.aviasquadronDAO.listAviasquadronData();
    }
}
