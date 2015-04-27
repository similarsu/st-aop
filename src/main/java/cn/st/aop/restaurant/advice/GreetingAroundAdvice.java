package cn.st.aop.restaurant.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * <p>
 * description:对naivewaiter服务进行规范，服务前后都要使用礼貌用语
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class GreetingAroundAdvice implements MethodInterceptor {
    /**
     * 在前后添加横切逻辑
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // TODO Auto-generated method stub
        Object[] args = invocation.getArguments();
        String clientName = (String) args[0];
        System.out.println("你好，" + clientName);
        Object obj = invocation.proceed();
        System.out.println("请自便！");
        return obj;
    }

}
