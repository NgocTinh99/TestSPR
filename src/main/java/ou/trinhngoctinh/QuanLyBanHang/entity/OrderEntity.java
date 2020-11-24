package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="items_name")
    private String itemsName;

    @Column(name="date_sell")
    private Date dateSell;

    @Column(name="amount_items")
    private Integer amountItems;

    @Column(name="price_items")
    private Integer priceItems;

    @Column(name="total_bill")
    private Integer totalBill;

    @ManyToOne
    @JoinColumn(name="user_id1")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private UserEntity userEntity1;

    @OneToOne
    @JoinColumn(name="user_id2")
    private UserEntity userEntity2;

}
