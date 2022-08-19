package purpleCheck.zeroError.domain.entity;
import lombok.Getter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@DynamicUpdate // 개별 업데이트
@Table(name="Inspect_info")
public class InspectInfo {
    @Id
    @Column(name = "inspect_id")
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tracking_id")
    private TrackingInfo tracking;

    private boolean completeYN;

    private LocalDateTime inspectDate;

    public boolean updateCompStatus(Boolean check){
        this.completeYN = check;
        this.inspectDate = LocalDateTime.now();
        return true;
    }
}
