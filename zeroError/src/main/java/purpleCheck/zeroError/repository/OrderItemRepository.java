package purpleCheck.zeroError.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import purpleCheck.zeroError.newForm.OrderItemDto;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderItemRepository {

    private final EntityManager em;

    public List<OrderItemDto> findById(long id) {
        return em.createQuery
                        ("select new purpleCheck.zeroError.newForm.OrderItemDto(i.id,i.brandName,i.name,oi.count) " +
                                "from OrderItem oi join oi.item i " +
                                "where oi.order.id=:id",
                                OrderItemDto.class)
                .setParameter("id", id)
                .getResultList();
    }
}
