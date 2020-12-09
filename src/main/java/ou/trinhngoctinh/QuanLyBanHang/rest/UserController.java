package ou.trinhngoctinh.QuanLyBanHang.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ou.trinhngoctinh.QuanLyBanHang.ServiceImpl.UserServiceImpl;
import ou.trinhngoctinh.QuanLyBanHang.entity.UserEntity;
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
        if(userService.getUser(id)==null){
            return ResponseEntity.ok("sai");
        } else{
            UserEntity userEntity = userService.getUser(id);
            return new ResponseEntity<UserEntity>(userEntity, HttpStatus.OK);
        }
    }
    @PostMapping("/add_user")
    public ResponseEntity<?> addUser(@RequestBody UserEntity userEntity) {
        UserEntity userEntity1 = userService.addUser(userEntity);
        return new ResponseEntity<UserEntity>(userEntity1, HttpStatus.OK);
    }
}
