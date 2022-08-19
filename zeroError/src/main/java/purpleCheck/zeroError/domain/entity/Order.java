package purpleCheck.zeroError.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name="Orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL) // 양방향
    private List<OrderItem> orderItems = new ArrayList<>();



    // 전체 주문 총가격
    public int getTotalCount() {
        int totalCount=0;
        for (OrderItem orderItem : orderItems) {
            totalCount += orderItem.getCount();
        }
        return totalCount;
    }
}
