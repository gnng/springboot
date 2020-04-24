package dependcy.repository;

import dependcy.domain.User;
import lombok.Data;

import java.util.Collection;

/**
 * @author gn
 * @desc TODO
 * @className springboot-UserRegister
 * @createTime 2020/4/1 11:20
 */
@Data
public class UserRegister {

    private Collection<User> userRepository;

}
