package cn.st.aop.restaurant.advice;

/**
 * <p>
 * description:训练不足的服务员
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月16日
 * @version v1.0
 */
public class NaiveWaiter implements Waiter {

    @Override
    public void greetTo(String name) {
        // TODO Auto-generated method stub
        System.out.println("greet to " + name + "……");
    }

    @Override
    public void serveTo(String name) {
        // TODO Auto-generated method stub
        System.out.println("serving " + name + "……");
    }

}
