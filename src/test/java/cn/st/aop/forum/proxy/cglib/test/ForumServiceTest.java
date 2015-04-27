package cn.st.aop.forum.proxy.cglib.test;

import org.junit.Test;

import cn.st.aop.forum.proxy.cglib.CglibProxy;
import cn.st.aop.forum.proxy.jdk.ForumServiceImpl;

public class ForumServiceTest {
    @Test
    public void testRemove() {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl f = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);// 通过动态生成子类的方式创建代理类
        f.removeForum(10);
        f.removeTopic(1023);

    }
}
