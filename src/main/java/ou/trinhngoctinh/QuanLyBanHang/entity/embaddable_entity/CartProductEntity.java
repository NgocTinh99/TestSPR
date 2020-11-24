package ou.trinhngoctinh.QuanLyBanHang.entity.embaddable_entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="cart_product")
@Entity
@Getter
@Setter

public class CartProductEntity {
    @EmbeddedId
    private CartProductPK id;
}
