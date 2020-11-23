package ou.trinhngoctinh.QuanLyBanHang.entity;

import javax.persistence.*;

@Entity
@Table (name ="cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "cart_name")
    private String careName;
}
