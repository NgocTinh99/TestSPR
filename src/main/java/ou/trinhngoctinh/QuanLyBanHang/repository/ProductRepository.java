package ou.trinhngoctinh.QuanLyBanHang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ou.trinhngoctinh.QuanLyBanHang.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    @Query(nativeQuery = true, value = "select * from product where id = ?1")
    ProductEntity findProductById(Integer id);
}
