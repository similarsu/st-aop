package cn.st.aop.forum.proxy.cglib;

public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId) {
        System.out.println("模拟删除Topic记录：" + topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
        PerformanceMonitor.begin("cn.st.aop.forum.proxy.ForumServiceImpl.remvoeForum");
        System.out.println("模拟删除Forum记录：" + forumId);
        try {
            Thread.currentThread().sleep(50);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
        PerformanceMonitor.end();
    }
}
