package cn.st.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * <p>
 * description:前置增强
 * </p>
 * 
 * @author coolearth
 * @since 2015年5月15日
 * @version v1.0
 */
public class GreetBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        // TODO Auto-generated method stub
        // 输出切点
        System.out.println(target.getClass().getName() + "." + method.getName());
        String clientName = (String) args[0];
        System.out.println("你好，" + clientName);
    }

}
