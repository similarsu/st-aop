package cn.st.aop.aspectj.anno;

public class ForumService {
    @NeedTest(true)
    public void deleteTopic(int topicId) {
        System.out.println("删除主题：" + topicId);
    }

    @NeedTest(false)
    public void deleteForum(int forumId) {
        System.out.println("删除模块：" + forumId);
    }
}
