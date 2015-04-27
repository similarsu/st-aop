package cn.st.aop.restaurant.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * <p>
 * description:对naive waiter的服务行为进行规范，在打招呼和提供服务前，都必须先对顾客使用礼貌用语
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月16日
 * @version v1.0
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        // TODO Auto-generated method stub
        String clientName = (String) args[0];
        System.out.println("你好！" + clientName + "先生。");
    }

}
