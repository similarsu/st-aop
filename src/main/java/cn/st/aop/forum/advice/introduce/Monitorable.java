package cn.st.aop.forum.advice.introduce;

/**
 * <p>
 * description:控制性能监控功能的开启和关闭
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月24日
 * @version v1.0
 */
public interface Monitorable {
    void setMonitorActive(boolean active);
}
