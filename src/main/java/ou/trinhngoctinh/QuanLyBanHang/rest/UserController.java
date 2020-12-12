package ou.trinhngoctinh.QuanLyBanHang.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ou.trinhngoctinh.QuanLyBanHang.ServiceImpl.UserServiceImpl;
import ou.trinhngoctinh.QuanLyBanHang.entity.UserEntity;
import ou.trinhngoctinh.QuanLyBanHang.request.AddUserRequest;
import ou.trinhngoctinh.QuanLyBanHang.service.UserService;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/get_alluser")
    public ResponseEntity<List<UserEntity>> getAll() {
        List<UserEntity> userEntityList = userService.getAllUser();
        return new ResponseEntity<List<UserEntity>>(userEntityList, HttpStatus.OK);
    }
    @GetMapping("/get_id/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Integer id) {
        UserEntity userEntity = userService.getUser(id);
        if(userEntity == null){
            return ResponseEntity.ok("Không tồn tại user có id: " + id);
        } else{
            return new ResponseEntity<UserEntity>(userEntity, HttpStatus.OK);
        }
    }
    @PostMapping("/add_user")
    public ResponseEntity<?> addUser(@RequestBody AddUserRequest userEntity) {
        UserEntity userEntity1 = userService.addUser(userEntity);
        if(userEntity1 == null)
            return ResponseEntity.ok("User đã tồn tại!");
        return new ResponseEntity<UserEntity>(userEntity1, HttpStatus.OK);
    }

    @PutMapping("/update_user")
    public ResponseEntity<?> updateUser(@RequestBody AddUserRequest userEntity) {
       UserEntity userEntity1 = userService.updateUser(userEntity, userEntity.getUserId());
       if(userEntity1 == null)
           return ResponseEntity.ok("Không tồn tại user có id: " + userEntity.getUserId());
       return new ResponseEntity<UserEntity>(userEntity1, HttpStatus.OK);
    }

    @DeleteMapping("/delete_user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id) {
        UserEntity userEntity1 = userService.getUser(id);
        if (userEntity1 == null)
            return ResponseEntity.ok("Không tồn tại user có id: " + id);
        userService.deleteUser(id);
        return ResponseEntity.ok("Xóa thành công user có id:"+ id);
    }
}
