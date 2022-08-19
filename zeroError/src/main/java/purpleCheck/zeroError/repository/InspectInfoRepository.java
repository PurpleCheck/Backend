package purpleCheck.zeroError.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import purpleCheck.zeroError.domain.entity.InspectInfo;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class InspectInfoRepository {

    private final EntityManager em;

    public InspectInfo findById(long id){
        return em.find(InspectInfo.class, id);
    }
}
