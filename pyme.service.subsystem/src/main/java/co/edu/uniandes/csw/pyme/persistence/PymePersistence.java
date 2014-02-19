
package co.edu.uniandes.csw.pyme.persistence;

import co.edu.uniandes.csw.pyme.logic.dto.PymeDTO;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.pyme.persistence.api.IPymePersistence;
import co.edu.uniandes.csw.pyme.persistence.converter.PymeConverter;
import co.edu.uniandes.csw.pyme.persistence.entity.PymeEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.persistence.Query;

@Default
@Stateless 
@LocalBean
public class PymePersistence extends _PymePersistence  implements IPymePersistence {

    public List<PymeDTO> searchPyme(PymeDTO pyme) {
        Query q = entityManager.createQuery("select u from PymeEntity u");
        
        List <PymeDTO> lista = PymeConverter.entity2PersistenceDTOList(q.getResultList());
        List <PymeDTO> resp = new ArrayList ();
        
        for (int i = 0; i < lista.size(); i++) {
            if ( lista.get(i).getName().contains(pyme.getName())){
                resp.add(lista.get(i));
                
            }
        }
	return resp;
    }

        
}