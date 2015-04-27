package cn.st.aop.forum.proxy.cglib;

/**
 * 
 * <p>
 * description:性能监视
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月13日
 * @version v1.0
 */
public class PerformanceMonitor {
    /**
     * ThreadLocal是将非线程安全类改造为线程安全类的法宝
     */
    public static ThreadLocal<MethodPerformance> performanceRecord =
            new ThreadLocal<MethodPerformance>();

    /**
     * 
     * <p>
     * description:开启对某个目标类方法的监控
     * </p>
     * 
     * @param method
     * 
     * @author coolearth
     * @since 2015年3月13日
     */
    public static void begin(String method) {
        // TODO Auto-generated method stub
        System.out.println("开始监控");
        MethodPerformance mp = new MethodPerformance(method);
        performanceRecord.set(mp);
    }

    public static void end() {
        // TODO Auto-generated method stub
        System.out.println("结束监控");
        MethodPerformance mp = performanceRecord.get();
        // 打印出方法性能监视的结果信息
        mp.printPerformance();
    }

}
