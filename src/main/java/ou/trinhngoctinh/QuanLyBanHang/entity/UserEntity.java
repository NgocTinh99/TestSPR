package ou.trinhngoctinh.QuanLyBanHang.entity;

import javax.persistence.*;

@Entity
@Table (name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name ="user_name")
    private String userName;

}
