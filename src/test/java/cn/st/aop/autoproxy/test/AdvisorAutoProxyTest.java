package cn.st.aop.autoproxy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.autoproxy.Seller;
import cn.st.aop.autoproxy.Waiter;



/**
 * <p>
 * description: advisor自动代理测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015-5-19
 * @version v1.0
 */
public class AdvisorAutoProxyTest {

    @Test
    public void testUseSpringXML() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autoproxy/advisor-auto-proxy.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        Seller seller = (Seller) context.getBean("seller");
        waiter.greetTo("张三");
        waiter.serveTo("张三");
        seller.greetTo("张三");
    }
}
