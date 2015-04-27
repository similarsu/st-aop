package cn.st.aop.forum.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import cn.st.aop.forum.proxy.PerformanceMonitor;

/**
 * <p>
 * description:编织器
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月13日
 * @version v1.0
 */
public class PerformanceHandler implements InvocationHandler {
    private Object target;// 目标类

    public PerformanceHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     * 将横切逻辑代码和业务逻辑代码编制到一起
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());
        Object obj = method.invoke(target, args);// 通过反射调用目标类的目标方法
        PerformanceMonitor.end();
        return obj;
    }

}
