package cn.st.aop.advisor.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.advisor.Seller;
import cn.st.aop.advisor.Waiter;


/**
 * <p>
 * description:静态普通方法名匹配切面测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class GreetingAdvisorTest {

    @Test
    public void testUseSpringXML() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("advisor/static-method-advisor.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("张三");
        waiter.serveTo("张三");

        Seller seller = (Seller) context.getBean("seller");
        seller.greetTo("张三");

    }
}
