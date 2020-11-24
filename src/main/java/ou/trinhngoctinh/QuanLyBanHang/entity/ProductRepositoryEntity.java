package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="product_repository")
public class ProductRepositoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="product_repository_name")
    private String productRepositoryName;

    @Column(name="product_repository_note")
    private String productRepositoryNote;

    @OneToMany(mappedBy="productRepositoryEntity", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<ProductEntity> productEntities;

}
