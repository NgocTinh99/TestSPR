package ou.trinhngoctinh.QuanLyBanHang.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ou.trinhngoctinh.QuanLyBanHang.service.ProductService;

@RestController
public class ProductRest {

    @Autowired
    private ProductService productService;
    //Theo luồng
    //Tạo API => Request
    //Gọi xuống service
    //Gọi xuống repository -> lấy dl từ dtb rồi trả lại service=> trả về cho rest => response
    @GetMapping("/product/find_product_by_id")
    public ResponseEntity<?> findProductById(@RequestParam("id") Integer id){
        return ResponseEntity.ok(productService.findProductById(id));
    }

}
