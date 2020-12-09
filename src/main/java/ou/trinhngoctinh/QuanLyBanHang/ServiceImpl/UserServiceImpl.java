package ou.trinhngoctinh.QuanLyBanHang.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ou.trinhngoctinh.QuanLyBanHang.entity.UserEntity;
import ou.trinhngoctinh.QuanLyBanHang.repository.UserRepository;
import ou.trinhngoctinh.QuanLyBanHang.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUser() {
        List<UserEntity> userEntityList = userRepository.findAll();
        return userEntityList;
    }
    @Override
    public UserEntity getUser(Integer id) {
        UserEntity userEntity = userRepository.getUserId(id);
        return userEntity;
    }
    @Override
    public UserEntity addUser(UserEntity userEntity) {
            return userRepository.save(userEntity);
    }
    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        userEntity = userRepository.save(userEntity);
        return userEntity;
    }
    @Override
    public boolean deleteUser(Integer id) {
        UserEntity userEntity = userRepository.getOne(id);
        if(userEntity != null){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
