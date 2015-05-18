package cn.st.aop.advisor.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.advisor.Waiter;

/**
 * <p>
 * description:静态正则表达式方法匹配切面测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class RegexpAdvisorTest {

    @Test
    public void testUseSpringXML() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("advisor/regexp-advisor.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("张三");
        waiter.serveTo("张三");
    }
}
