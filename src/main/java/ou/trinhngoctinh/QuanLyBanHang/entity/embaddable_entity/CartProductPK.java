package ou.trinhngoctinh.QuanLyBanHang.entity.embaddable_entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable
public class CartProductPK implements Serializable {
    @Column(name="cart_id")
    private Integer cartId;

    @Column(name="product_id")
    private Integer productId;
}
