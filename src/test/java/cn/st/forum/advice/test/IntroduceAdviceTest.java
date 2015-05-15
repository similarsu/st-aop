package cn.st.forum.advice.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.forum.advice.introduce.ForumService;
import cn.st.aop.forum.advice.introduce.Monitorable;

/**
 * <p>
 * description:引介增强测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class IntroduceAdviceTest {

    @Test
    public void testUseSpringXML() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("forum/introduce.xml");
        ForumService forumService = (ForumService) context.getBean("forumService");
        // 未开启监控
        forumService.removeTopic(1000);
        // 开启监控
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);
        forumService.removeTopic(1000);
    }
}
