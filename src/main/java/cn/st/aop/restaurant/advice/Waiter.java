package cn.st.aop.restaurant.advice;

/**
 * <p>
 * description:服务生
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月16日
 * @version v1.0
 */
public interface Waiter {
    /*
     * 打招呼
     */
    void greetTo(String name);

    /*
     * 提供服务
     */
    void serveTo(String name);
}
