/**
 * 
 */
package cn.st.aop.advisor.dynamic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import cn.st.aop.advisor.Waiter;

/**
 * 
 * <p>
 * desciption:动态切点
 * </p>
 * 
 * @author coolearth
 * @date 2015年5月18日
 */
public class GreetingDefaultDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClient = new ArrayList<String>();
    static {
        specialClient.add("张三");
        specialClient.add("李四");
    }

    /**
     * 对类进行静态切点检验
     */
    @Override
    public ClassFilter getClassFilter() {
        // TODO Auto-generated method stub
        return new ClassFilter() {

            @Override
            public boolean matches(Class<?> clazz) {
                // TODO Auto-generated method stub
                System.out.println("调用getClassFilter()对" + clazz.getName() + "进行静态校验");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    /**
     * 对方法进行静态校验
     */
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        // TODO Auto-generated method stub
        System.out.println("调用matches(method,class)对" + targetClass.getName() + "."
                + method.getName() + "进行静态校验");
        return "greetTo".equals(method.getName());
    }

    /**
     * 对方法进行动态校验
     */
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object[] args) {
        // TODO Auto-generated method stub
        System.out.println("调用matches(method,class,args)对" + targetClass.getName() + "."
                + method.getName() + "进行动态校验");
        String clientName = (String) args[0];
        return specialClient.contains(clientName);
    }

}
