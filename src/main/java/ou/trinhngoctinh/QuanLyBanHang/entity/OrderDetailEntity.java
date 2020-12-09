package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="order_detail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="order_id")
    private Integer orderId;
    @Column(name="product_id")
    private Integer productId;
    @Column(name="date_sell")
    private Date dateSell;
    @Column(name="product_quantity")
    private int productQuantity;
    @Column(name="into_money")
    private double intoMoney;
}
