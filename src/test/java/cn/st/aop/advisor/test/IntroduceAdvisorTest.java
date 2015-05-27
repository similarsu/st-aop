package cn.st.aop.advisor.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.st.aop.advisor.introduce.ForumService;
import cn.st.aop.advisor.introduce.Monitorable;


/**
 * <p>
 * description:引介切面测试类
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class IntroduceAdvisorTest {

    @Test
    public void testUseSpringXML() throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("advisor/introduce-advisor.xml");
        ForumService forumService = (ForumService) context.getBean("forumService");
        // 未开启监控
        forumService.removeTopic(1000);
        // 开启监控
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);
        forumService.removeTopic(1000);
    }
}
