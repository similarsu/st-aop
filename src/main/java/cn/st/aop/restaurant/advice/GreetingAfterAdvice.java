package cn.st.aop.restaurant.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * <p>
 * description:对naivewaiter服务行为进行规范，在每次服务后使用规范的礼貌用语
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月20日
 * @version v1.0
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("请自便！");
    }

}
