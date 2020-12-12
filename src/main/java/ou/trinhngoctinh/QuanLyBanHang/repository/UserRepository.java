package ou.trinhngoctinh.QuanLyBanHang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ou.trinhngoctinh.QuanLyBanHang.entity.UserEntity;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query (value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
    UserEntity getUserId(Integer id);

    @Query(value = "SELECT * FROM  user WHERE  user_name = ?1", nativeQuery = true)
    UserEntity findByUserName(String userName);

    @Query(value = "SELECT * FROM  user where  user_phone = ?1", nativeQuery = true)
    UserEntity findByUserPhone(int userPhone);
}
