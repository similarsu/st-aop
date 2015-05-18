package cn.st.aop.advisor.flow;

import cn.st.aop.advisor.Waiter;

/**
 * <p>
 * desciption: 代理类
 * </p>
 * 
 * @author coolearth
 * @date 2015年5月18日
 */
public class WaiterDelegate {
    private Waiter waiter;

    public void service(String clientName) {
        waiter.greetTo(clientName);
        waiter.serveTo(clientName);
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

}
