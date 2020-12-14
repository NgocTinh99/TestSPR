package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="orderr")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="date_sell")
    private Date dateSell;
    @Column(name ="user_id")
    private Integer userId;
    @Column(name="product_id")
    private Integer productId;
}
