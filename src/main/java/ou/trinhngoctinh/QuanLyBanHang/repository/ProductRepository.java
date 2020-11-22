package ou.trinhngoctinh.QuanLyBanHang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ou.trinhngoctinh.QuanLyBanHang.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
