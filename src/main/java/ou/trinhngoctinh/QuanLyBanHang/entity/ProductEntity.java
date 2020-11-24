package ou.trinhngoctinh.QuanLyBanHang.entity;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name="product")
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id tự động tăng
    private Integer id;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_repository_name")
    private String productRepositoryName;

    @Column(name="product_quantity")
    private Integer productQuantity;

    @Column(name="product_price")
    private Integer productPrice;

    @Column(name="product_infomations")
    private String productInfomations;

    @ManyToOne
    @JoinColumn(name="product_repository_id1")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ProductRepositoryEntity productRepositoryEntity1;

    @OneToOne
    @JoinColumn(name="product_repository_id2")
    private ProductRepositoryEntity productRepositoryEntity2;

    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<OrderEntity> orderEntities;

    @ManyToOne
    @JoinColumn(name="order_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private OrderEntity orderEntity;

    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<CartEntity> cartEntities;

    @ManyToOne
    @JoinColumn(name="cart_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private CartEntity cartEntity;
}

