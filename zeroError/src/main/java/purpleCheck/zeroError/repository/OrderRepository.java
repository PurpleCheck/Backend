package purpleCheck.zeroError.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import purpleCheck.zeroError.domain.entity.Order;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public Order findById(long id) {
        return em.find(Order.class, id);
    }
}
