package cn.st.aop.forum.proxy.test;

import org.junit.Test;

import cn.st.aop.forum.proxy.ForumService;
import cn.st.aop.forum.proxy.ForumServiceImpl;

public class ForumServiceTest {
    @Test
    public void testRemove() {
        ForumService f = new ForumServiceImpl();
        f.removeForum(10);
        f.removeTopic(10);
    }
}
