package ou.trinhngoctinh.QuanLyBanHang.entity;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

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

    @Column(name="product_category_name")
    private String productCategoryName;

    @Column(name="product_quantity")
    private Integer productQuantity;

    @Column(name="product_price")
    private Integer productPrice;

    @Column(name="product_infomations")
    private String productInfomations;

    @ManyToOne
    @JoinColumn(name="product_Category_id1")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ProductCategoryEntity productCategoryEntity1;

    @OneToOne
    @JoinColumn(name="product_category_id2")
    private ProductCategoryEntity productCategoryEntity2;

}

