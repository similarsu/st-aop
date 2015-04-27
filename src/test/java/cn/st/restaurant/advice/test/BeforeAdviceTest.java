package cn.st.restaurant.advice.test;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.restaurant.advice.GreetingBeforeAdvice;
import cn.st.aop.restaurant.advice.NaiveWaiter;
import cn.st.aop.restaurant.advice.Waiter;

/**
 * <p>
 * description:前置增强测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class BeforeAdviceTest {
    /**
     * 
     * <p>
     * description:使用cglib代理
     * </p>
     * 
     * 
     * @author coolearth
     * @since 2015年3月20日
     */
    @Test
    public void testBeforeAdviceUseCGLIB() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        // spring提供代理工厂
        ProxyFactory factory = new ProxyFactory();
        // 设置代理对象
        factory.setTarget(target);
        // 添加增强
        factory.addAdvice(advice);
        // 生成代理实例
        Waiter proxy = (Waiter) factory.getProxy();
        proxy.greetTo("张三");
        proxy.serveTo("李四");
    }

    /**
     * 
     * <p>
     * description:针对接口，使用JDK代理
     * </p>
     * 
     * 
     * @author coolearth
     * @since 2015年3月20日
     */
    @Test
    public void testBeforeAdviceUseJDK() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        // spring提供代理工厂
        ProxyFactory factory = new ProxyFactory();
        // 对接口进行代理
        factory.setInterfaces(target.getClass().getInterfaces());
        factory.setTarget(target);
        // 添加增强
        factory.addAdvice(advice);
        // 生成代理实例
        Waiter proxy = (Waiter) factory.getProxy();
        proxy.greetTo("张三");
        proxy.serveTo("李四");
    }

    /**
     * 
     * <p>
     * description:针对接口，使用优化，使用cglib代理
     * </p>
     * 
     * 
     * @author coolearth
     * @since 2015年3月20日
     */
    @Test
    public void testBeforeAdviceUseOptimize() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        // spring提供代理工厂
        ProxyFactory factory = new ProxyFactory();
        // 对接口进行代理
        factory.setInterfaces(target.getClass().getInterfaces());
        factory.setOptimize(true);
        factory.setTarget(target);
        // 添加增强
        factory.addAdvice(advice);
        // 生成代理实例
        Waiter proxy = (Waiter) factory.getProxy();
        proxy.greetTo("张三");
        proxy.serveTo("李四");
    }

    @Test
    public void testUseSpringXML() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("restaurant/greeting-before.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("张三");
        waiter.serveTo("李四");
    }
}
