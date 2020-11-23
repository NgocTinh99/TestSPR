package ou.trinhngoctinh.QuanLyBanHang.entity;

import javax.persistence.*;

@Entity
@Table (name="order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="order_name")
    private String orderName;
}
