package cn.st.aop.advisor.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.advisor.Waiter;
import cn.st.aop.advisor.flow.WaiterDelegate;


/**
 * <p>
 * description:复合切面测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class ComposableAdvisorTest {

    @Test
    public void testUseSpringXML() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("advisor/composable-advisor.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        WaiterDelegate waiterDelegate = new WaiterDelegate();
        waiterDelegate.setWaiter(waiter);
        waiter.greetTo("张三");
        waiter.serveTo("张三");
        waiterDelegate.service("张三");
    }
}
