package purpleCheck.zeroError.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name="Members")
public class Member {
    @Id
    @Column(name = "member_id")
    private long id;
    private String name;
    private String phone;

    @OneToMany(mappedBy = "member") // 양방향
    private List<Order> orders = new ArrayList<>();
}
