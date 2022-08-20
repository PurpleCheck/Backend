package purpleCheck.zeroError.domain.entity;
import lombok.Getter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@DynamicUpdate // 개별 업데이트
@Table(name="Inspect_Info")
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

    @Column(name = "complete_yn")
    private boolean completeYN;

    @Column(name="inspect_date")
    private LocalDateTime inspectDate;

    public boolean updateCompStatus(boolean completeYN){
        this.completeYN = completeYN;
        this.inspectDate = LocalDateTime.now();
        return true;
    }
}
