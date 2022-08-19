package purpleCheck.zeroError.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name="Tracking_Info")
public class TrackingInfo {
    @Id
    @Column(name = "tracking_id")
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    private LocalDateTime orderDate;
}
