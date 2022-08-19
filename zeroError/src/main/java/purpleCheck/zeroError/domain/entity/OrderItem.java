package purpleCheck.zeroError.domain.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="Order_Item")
public class OrderItem {
    @Id
    @Column(name = "order_item_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="item_id")
    private Item item;

    private int count; // 상품 주문 개수

}
