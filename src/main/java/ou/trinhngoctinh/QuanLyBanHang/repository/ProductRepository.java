package ou.trinhngoctinh.QuanLyBanHang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ou.trinhngoctinh.QuanLyBanHang.entity.ProductEntity;
import ou.trinhngoctinh.QuanLyBanHang.request.AddProductRequest;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    @Query(value ="SELECT * FROM product WHERE product_name = ?1", nativeQuery = true)
    ProductEntity getProductName(String productName);

    @Query(value = "SELECT * FROM product WHERE id = ?1", nativeQuery = true)
    ProductEntity getProductId(Integer id);

    @Query(value = "select c.category_name from category c left join product p on c.id = p.category_id where c.category_name = ?1", nativeQuery = true)
    ProductEntity getProductByCategoryName(String categoryName);
}
