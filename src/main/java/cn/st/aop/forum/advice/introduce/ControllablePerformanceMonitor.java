package cn.st.aop.forum.advice.introduce;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * <p>
 * description:必须插入描述TODO
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月24日
 * @version v1.0
 */
public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor
        implements
            Monitorable {
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;
        if (monitorStatusMap.get() != null && monitorStatusMap.get()) {
            PerformanceMonitor.begin(mi.getClass().getName() + "." + mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        } else {
            obj = super.invoke(mi);
        }
        return obj;
    }

    private ThreadLocal<Boolean> monitorStatusMap = new ThreadLocal<Boolean>();// 保存性能监视开关状态

    @Override
    public void setMonitorActive(boolean active) {
        // TODO Auto-generated method stub
        monitorStatusMap.set(active);
    }

}
