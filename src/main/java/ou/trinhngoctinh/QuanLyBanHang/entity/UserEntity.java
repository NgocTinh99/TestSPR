package ou.trinhngoctinh.QuanLyBanHang.entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="user_name")
    private String userName;

    @Column(name="user_password")
    private String userPassword;

    @Column(name ="customer_name")
    private String customerName;

    @Column(name="user_address")
    private String userAddress;

    @Column(name="user_phone")
    private Integer userPhone;



    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<OrderEntity> orderEntities;

    @OneToOne
    @JoinColumn(name="cart_id")
    private CartEntity cartEntity;
}
