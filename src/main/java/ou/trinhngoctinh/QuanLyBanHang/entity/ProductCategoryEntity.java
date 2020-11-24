package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="product_category")
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="product_category_name")
    private String productCategoryName;

    @Column(name="product_category_note")
    private String productCategoryNote;

    @OneToMany(mappedBy="productCategoryEntity", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<ProductEntity> productEntities;

}
