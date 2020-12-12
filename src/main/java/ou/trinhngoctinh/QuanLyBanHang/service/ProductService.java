package ou.trinhngoctinh.QuanLyBanHang.service;

import org.springframework.stereotype.Service;
import ou.trinhngoctinh.QuanLyBanHang.entity.ProductEntity;
import ou.trinhngoctinh.QuanLyBanHang.entity.UserEntity;
import ou.trinhngoctinh.QuanLyBanHang.request.AddProductRequest;
import java.util.List;

@Service
public interface ProductService {
    public List<ProductEntity> getAllProduct();
    public ProductEntity getProduct(Integer id);
    public ProductEntity getProductName(String productName);
    public ProductEntity getProductCategoryName(String categoryName);
    public ProductEntity addProduct (AddProductRequest productEntity);
    public ProductEntity updateProduct(AddProductRequest productEntity, Integer id);
    public ProductEntity deleteProduct(Integer id);

}
