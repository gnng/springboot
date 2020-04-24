package dependcy.injection;

import dependcy.domain.User;
import dependcy.repository.UserRegister;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author gn
 * @desc TODO
 * @className springboot-DependcyInjectionDemo
 * @createTime 2020/4/1 11:29
 */
public class DependcyInjectionDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(UserRegister.class);
        annotationConfigApplicationContext.refresh();
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/MATE-INF/dependcy-injection-context.xml");
//        UserRegister userRegister = beanFactory.getBean(UserRegister.class);
//        System.out.println("从集合中获取"+userRegister.getUserRepository());
//        lookupCollectionByType(beanFactory);
        lookupCollectionByType(annotationConfigApplicationContext);
    }


    private static void lookupCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找所有user集合对象" + users);
        }

    }
}
