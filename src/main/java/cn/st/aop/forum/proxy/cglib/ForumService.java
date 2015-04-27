package cn.st.aop.forum.proxy.cglib;

public interface ForumService {
    void removeTopic(int topicId);

    void removeForum(int forumId);
}
