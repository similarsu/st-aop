package cn.st.aop.forum;

public class ForumService {
    private TransactionManager transactionManager;
    private PerformanceMonitor performanceMonitor;
    private ForumDao forumDao;
    private TopicDao topicDao;

    public void removeTopic(int topicId) {
        performanceMonitor.start();
        transactionManager.beginTransaction();
        topicDao.removeTopic(topicId);
        transactionManager.commit();
        performanceMonitor.end();
    }

    public void create(Forum forum) {
        performanceMonitor.start();
        transactionManager.beginTransaction();
        forumDao.create(forum);
        transactionManager.commit();
        performanceMonitor.end();
    }
}
