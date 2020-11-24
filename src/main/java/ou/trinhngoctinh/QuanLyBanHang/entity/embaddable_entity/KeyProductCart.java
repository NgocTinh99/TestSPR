package ou.trinhngoctinh.QuanLyBanHang.entity.embaddable_entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class KeyProductCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="product_id")
    private Long productId;

    @Column(name="cart_id")
    private Long cartId;

}
