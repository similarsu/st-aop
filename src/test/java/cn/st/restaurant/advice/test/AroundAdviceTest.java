package cn.st.restaurant.advice.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.restaurant.advice.Waiter;

/**
 * <p>
 * description:环绕增强测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class AroundAdviceTest {

    @Test
    public void testUseSpringXML() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("restaurant/greeting-around.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("张三");
        waiter.serveTo("李四");
    }
}
