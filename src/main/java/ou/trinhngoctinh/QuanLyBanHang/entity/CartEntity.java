package ou.trinhngoctinh.QuanLyBanHang.entity;

import javax.persistence.*;

@Entity
@Table (name="cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="user_name")
    private String userName;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_repository_name")
    private String productRepositoryName;

    @Column(name="amount_items")
    private Integer amountItems;

    @Column(name="total_bill")
    private Integer totalBill;
}
