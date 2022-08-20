package purpleCheck.zeroError.newForm;

import lombok.Getter;

@Getter
public class OrderItemForm {
    private long itemId;
    private String brandName;
    private String itemName;
    private int count;
    private int checkCount;
    private boolean checked;

    public OrderItemForm(OrderItemDto orderItemDto) {

        this.itemId = orderItemDto.getItemId();
        this.brandName = orderItemDto.getBrandName();
        this.itemName = orderItemDto.getItemName();
        this.count = orderItemDto.getCount();
        this.checkCount=0;
        this.checked=false;
    }
}
