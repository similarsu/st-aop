package cn.st.aop.forum.proxy.jdk.test;

import java.lang.reflect.Proxy;

import org.junit.Test;

import cn.st.aop.forum.proxy.jdk.ForumService;
import cn.st.aop.forum.proxy.jdk.ForumServiceImpl;
import cn.st.aop.forum.proxy.jdk.PerformanceHandler;

public class ForumServiceTest {
    @Test
    public void testRemove() {
        ForumService target = new ForumServiceImpl();// 被代理的目标业务类
        PerformanceHandler handler = new PerformanceHandler(target);// 将目标业务类和横切代码编织到一起
        // 根据编织了目标业务类逻辑和性能监视横切逻辑的InvocationHandler实例创建代理实例
        ForumService proxy =
                (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target
                        .getClass().getInterfaces(), handler);
        proxy.removeForum(10);
        proxy.removeTopic(1012);
    }
}
