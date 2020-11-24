package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name="cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_repository_name")
    private String productRepositoryName;

    @Column(name="amount_items")
    private Integer amountItems;

    @Column(name="total_bill")
    private Integer totalBill;

    @ManyToOne
    @JoinColumn(name="product_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ProductEntity productEntity;

    @OneToMany(mappedBy = "CartEntity", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<ProductEntity> productEntities;

    @OneToOne
    @JoinColumn(name="user_id")
    private UserEntity userEntity;
}
