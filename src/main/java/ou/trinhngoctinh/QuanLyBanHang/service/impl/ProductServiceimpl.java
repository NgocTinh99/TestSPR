package ou.trinhngoctinh.QuanLyBanHang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ou.trinhngoctinh.QuanLyBanHang.entity.ProductEntity;
import ou.trinhngoctinh.QuanLyBanHang.repository.ProductRepository;
import ou.trinhngoctinh.QuanLyBanHang.service.ProductService;


@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public ProductEntity findProductById(Integer id) {
        ProductEntity product = productRepository.findProductById(id);
        return product;
    }
}
