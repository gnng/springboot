package dependcy.lookup;

import dependcy.domain.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author gn
 * @desc TODO
 * @className springboot-BeanDefinitionBuilderTest
 * @createTime 2020/4/9 14:01
 */
public class BeanDefinitionBuilderTest {
    public static void main(String[] args) {
        // 指定class
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        // 设置属性
        builder
                .addPropertyValue("name", "gnng")
                .addPropertyValue("id", 1L);
        // 获取BeanDefinition对象
        BeanDefinition beanDefinition = builder.getBeanDefinition();
        System.out.println(beanDefinition);

        // 创建IoC容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 向容器中注册bean
        beanFactory.registerBeanDefinition("user", beanDefinition);
        System.out.println(beanFactory.getBean("user",User.class));
    }
}
