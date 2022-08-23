package purpleCheck.zeroError.newForm;

import lombok.Getter;

import java.util.List;

@Getter
public class OrderListResForm {

    private long inspectId;
    private long orderId;
    private String trackingId;
    private List<OrderItemForm> orderItemFormList;
    private int totalCount;
    private int totalCheckCount;
    private boolean completeYN;

    public OrderListResForm(long inspectId, long orderId, String trackingId, List<OrderItemForm> orderItemFormList, int totalCount, boolean completeYN) {
        this.inspectId = inspectId;
        this.orderId = orderId;
        this.trackingId = trackingId;
        this.orderItemFormList = orderItemFormList;
        this.totalCount=totalCount;
        this.completeYN=completeYN;
        this.totalCheckCount=0;
    }
}
