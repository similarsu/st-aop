package cn.st.aop.advisor.staticmethod;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import cn.st.aop.advisor.Waiter;

/**
 * <p>
 * description:静态普通方法名匹配切面
 * </p>
 * 
 * @author coolearth
 * @since 2015年5月15日
 * @version v1.0
 */
public class GreetAdvisor extends StaticMethodMatcherPointcutAdvisor {
    /**
     * 切点方法匹配规则
     */
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        // TODO Auto-generated method stub
        return "greetTo".equals(method.getName());
    }

    /**
     * 切点类匹配规则
     */
    @Override
    public ClassFilter getClassFilter() {
        // TODO Auto-generated method stub
        return new ClassFilter() {

            @Override
            public boolean matches(Class<?> clazz) {
                // TODO Auto-generated method stub
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

}
