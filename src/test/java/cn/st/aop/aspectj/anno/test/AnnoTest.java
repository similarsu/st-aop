package cn.st.aop.aspectj.anno.test;

import java.lang.reflect.Method;

import org.junit.Test;

import cn.st.aop.aspectj.anno.ForumService;
import cn.st.aop.aspectj.anno.NeedTest;

/**
 * <p>
 * desciption:注解测试类
 * </p>
 * 
 * @author coolearth
 * @date 2015年6月18日
 */
public class AnnoTest {
    @Test
    public void testAnno() {
        Class clazz = ForumService.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            NeedTest needTest = method.getAnnotation(NeedTest.class);
            if (needTest != null) {
                if (needTest.value()) {
                    System.out.println(method.getName() + "需要测试");
                } else {
                    System.out.println(method.getName() + "不需要测试");
                }
            }
        }
    }
}
