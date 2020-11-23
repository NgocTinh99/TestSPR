package ou.trinhngoctinh.QuanLyBanHang.entity;

import javax.persistence.*;

@Entity
@Table(name="product_repository")
public class ProductRepositoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_repository_name")
    private String productRepositoryName;


}
