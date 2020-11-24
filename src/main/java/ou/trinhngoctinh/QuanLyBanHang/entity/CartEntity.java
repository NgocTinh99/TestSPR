package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name="cart")
@AllArgsConstructor
@NoArgsConstructor
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_category_name")
    private String productCategoryName;

    @Column(name="amount_items")
    private Integer amountItems;

    @Column(name="total_bill")
    private Integer totalBill;

    @OneToOne
    @JoinColumn(name="user_id")
    private UserEntity userEntity;
}
