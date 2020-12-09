package ou.trinhngoctinh.QuanLyBanHang.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import ou.trinhngoctinh.QuanLyBanHang.entity.UserEntity;
import java.util.List;

@Service
public interface UserService {
    public List<UserEntity> getAllUser();
    public UserEntity getUser(Integer id);
    public UserEntity addUser(UserEntity userEntity);
    public UserEntity updateUser(UserEntity userEntity);
    public boolean deleteUser(Integer id);
}
