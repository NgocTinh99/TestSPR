package ou.trinhngoctinh.QuanLyBanHang.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ou.trinhngoctinh.QuanLyBanHang.entity.CategoryEntity;
import ou.trinhngoctinh.QuanLyBanHang.entity.ProductEntity;
import ou.trinhngoctinh.QuanLyBanHang.repository.CategoryRepository;
import ou.trinhngoctinh.QuanLyBanHang.repository.ProductRepository;
import ou.trinhngoctinh.QuanLyBanHang.request.AddProductRequest;
import ou.trinhngoctinh.QuanLyBanHang.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAllProduct() {
        List<ProductEntity> productEntityList = productRepository.findAll();
        return productEntityList;
    }

    @Override
    public ProductEntity getProduct(Integer id) {
        ProductEntity productEntity = productRepository.getProductId(id);
        if(productEntity == null)
            return null;
        return productEntity;
    }

    @Override
    public ProductEntity getProductName(String productName) {
        ProductEntity productEntity = productRepository.getProductName(productName);
        if (productEntity == null)
            return null;
        return productEntity;
    }

    @Override
    public ProductEntity getProductCategoryName(String categoryName){
        ProductEntity productEntity = productRepository.getProductByCategoryName(categoryName);
        if (productEntity == null)
            return null;
        else
            return productEntity;
    }

    @Override
    public ProductEntity addProduct(AddProductRequest request) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(request.getProductName());
        productEntity.setProductPrice(request.getProductPrice());
        productEntity.setProductDescrition(request.getProductDescrition());
        productEntity.setCategoryId(request.getCategoryId());
        productEntity = productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity updateProduct(AddProductRequest request, Integer id) {
        ProductEntity productEntity = productRepository.getProductId(id);
        if (productEntity == null)
            return null;
        else {
            productEntity.setProductName(request.getProductName());
            productEntity.setProductPrice(request.getProductPrice());
            productEntity.setProductDescrition(request.getProductDescrition());
            productEntity = productRepository.save(productEntity);
            return productEntity;
        }
    }

    @Override
    public ProductEntity deleteProduct(Integer id) {
        ProductEntity productEntity = productRepository.getProductId(id);
        if (productEntity == null)
            return null;
        productRepository.deleteById(id);
        return productEntity;
    }
}
