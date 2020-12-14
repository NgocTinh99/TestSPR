package ou.trinhngoctinh.QuanLyBanHang.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ou.trinhngoctinh.QuanLyBanHang.entity.ProductEntity;
import ou.trinhngoctinh.QuanLyBanHang.request.AddProductRequest;
import ou.trinhngoctinh.QuanLyBanHang.service.ProductService;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get_allproduct")
    public ResponseEntity<List<ProductEntity>> getAll() {
        List<ProductEntity> productEntityList = productService.getAllProduct();
        return new ResponseEntity<List<ProductEntity>>(productEntityList, HttpStatus.OK);
    }
    @GetMapping("/get_name")
    public ResponseEntity<?> getProductName(@RequestParam String productName) {
        ProductEntity productEntity = productService.getProductName(productName);
        if(productEntity == null)
            return ResponseEntity.ok("Không tồn tại product có tên: " + productName);
        return new ResponseEntity<ProductEntity>(productEntity, HttpStatus.OK);
    }
    @GetMapping("/get_category_name")
    public ResponseEntity<?> getProductCategoryName(@RequestParam String categoryName){
        ProductEntity productEntity = productService.getProductCategoryName(categoryName);
        if(productEntity == null)
            return ResponseEntity.ok("Không tồn tại product có tên nhóm: "+ categoryName);
        return new ResponseEntity<ProductEntity>(productEntity, HttpStatus.OK);
    }

    @PostMapping("/add_product")
    public ResponseEntity<?> addProduct(@RequestBody AddProductRequest productEntity) {
        ProductEntity productEntity1 = productService.addProduct(productEntity);
        return new ResponseEntity<ProductEntity>(productEntity1, HttpStatus.OK);
    }

    @PutMapping("/update_product")
    public ResponseEntity<?> updateProduct(@RequestBody AddProductRequest productEntity) {
        ProductEntity productEntity1 = productService.updateProduct(productEntity, productEntity.getProductId());
        if(productEntity1 == null)
            return ResponseEntity.ok("Không tồn tại product có id: " + productEntity.getProductId());
        return new ResponseEntity<ProductEntity>(productEntity1, HttpStatus.OK);
    }

    @DeleteMapping("/delete_product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Integer id) {
        ProductEntity productEntity = productService.getProduct(id);
        if (productEntity == null)
            return ResponseEntity.ok("Không tồn tại product có id: " + id);
        productService.deleteProduct(id);
        return ResponseEntity.ok("Xóa thành công product có id:"+ id);
    }
}
