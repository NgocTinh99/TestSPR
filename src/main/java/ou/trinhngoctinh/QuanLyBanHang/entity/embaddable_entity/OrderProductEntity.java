package ou.trinhngoctinh.QuanLyBanHang.entity.embaddable_entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "order_product")
@Entity
@Getter
@Setter
public class OrderProductEntity {

    @EmbeddedId
    private OrderProductPK id;


}
