package cn.st.aop.aspectj.anno;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.aspectj.NaiveWaiter;
import cn.st.aop.aspectj.PreGreetingAspect;
import cn.st.aop.aspectj.Waiter;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年6月18日
 */
public class BeforeGreetingAspectjTest {
    @Test
    public void test() {
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();
        // 设置目标对象
        aspectJProxyFactory.setTarget(target);
        // 添加切面类
        aspectJProxyFactory.addAspect(PreGreetingAspect.class);
        // 生成织入切面的代理对象
        Waiter proxy = aspectJProxyFactory.getProxy();
        proxy.serveTo("张三");
        proxy.greetTo("张三");
    }

    @Test
    public void testUseSpringXML() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aspectj/before-aspectj.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("张三");
        waiter.serveTo("张三");
    }
}
