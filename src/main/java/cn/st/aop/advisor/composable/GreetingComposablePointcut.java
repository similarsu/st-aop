package cn.st.aop.advisor.composable;

import java.lang.reflect.Method;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.StaticMethodMatcher;

import cn.st.aop.advisor.flow.WaiterDelegate;

/**
 * <p>
 * desciption:流程切点和方法名切点相交的切点
 * </p>
 * 
 * @author coolearth
 * @date 2015年5月18日
 */
public class GreetingComposablePointcut {
    public Pointcut getIntersectionPointcut() {
        // 创建复合切点
        ComposablePointcut cp = new ComposablePointcut();
        // 流程切点
        Pointcut cp1 = new ControlFlowPointcut(WaiterDelegate.class, "service");
        // 方法名切点
        StaticMethodMatcher methodMatcher = new StaticMethodMatcher() {

            @Override
            public boolean matches(Method method, Class<?> targetClass) {
                // TODO Auto-generated method stub
                return "greetTo".equals(method.getName());
            }
        };
        // 进行复合
        return cp.intersection(cp1).intersection(methodMatcher);
    }
}
