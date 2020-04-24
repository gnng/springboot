package com.gnng;

import com.gnng.sys.entity.User;
import com.gnng.sys.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author gn
 * @Date 2019/6/25 15:21
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class SampTest {

    @Autowired
    private IUserService userService;



    @Test
    public void testSelect(){
        log.info("select All test {}",Thread.currentThread().getName());
        List<User> users = userService.list(null);
        users.forEach(System.out::println);
    }
}
