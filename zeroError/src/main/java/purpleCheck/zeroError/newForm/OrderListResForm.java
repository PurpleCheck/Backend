package purpleCheck.zeroError.newForm;

import lombok.Getter;

import java.util.List;

@Getter
public class OrderListResForm {

    private long inspectId;
    private long orderId;
    private String trackingId;
    private List<OrderItemDto> orderList;
    private int totalCount;

    public OrderListResForm(long inspectId, long orderId, String trackingId, List<OrderItemDto> orderList, int totalCount) {
        this.inspectId = inspectId;
        this.orderId = orderId;
        this.trackingId = trackingId;
        this.orderList = orderList;
        this.totalCount=totalCount;
    }
}
