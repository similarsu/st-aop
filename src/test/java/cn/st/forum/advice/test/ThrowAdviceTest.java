package cn.st.forum.advice.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.forum.advice.ForumService;

/**
 * <p>
 * description:异常抛出增强测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class ThrowAdviceTest {

    @Test
    public void testUseSpringXML() throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("forum/transaction-throws.xml");
        ForumService forumService = (ForumService) context.getBean("forumService");
        // forumService.removeForum(100);
        forumService.removeTopic(1000);
    }
}
