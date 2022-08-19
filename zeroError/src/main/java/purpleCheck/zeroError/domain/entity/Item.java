package purpleCheck.zeroError.domain.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name="Item")
public class Item {
    @Id
    @Column(name = "item_id")
    private long id;
    @Column(name = "item_name")
    private String name;
    private String brandName;
    private int price;
    private int count; // 재고
}
