package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name="cart")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="product_id")
    private Integer productId;
    @Column(name="product_quantity")
    private int productQuantity;
    @Column(name="total_bill")
    private double totalBill;
    @Column(name="user_id")
    private Integer userId;
}
