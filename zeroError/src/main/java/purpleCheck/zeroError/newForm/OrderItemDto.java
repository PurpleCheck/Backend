package purpleCheck.zeroError.newForm;

import lombok.Data;

@Data
public class OrderItemDto {
    private long itemId;
    private String brandName;
    private String itemName;
    private int count;

    public OrderItemDto(long itemId,String brandName, String itemName, int count) {
        this.itemId=itemId;
        this.brandName = brandName;
        this.itemName = itemName;
        this.count = count;
    }
}
