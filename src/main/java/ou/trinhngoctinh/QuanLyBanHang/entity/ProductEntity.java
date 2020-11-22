package ou.trinhngoctinh.QuanLyBanHang.entity;


import javax.persistence.*;

@Entity
@Table (name ="product")
public class ProductEntity {
    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id tự động tăng
    private Integer id;

    @Column(name = "product_name")
    private String productName;
}

