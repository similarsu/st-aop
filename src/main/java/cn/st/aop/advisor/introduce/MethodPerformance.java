package cn.st.aop.advisor.introduce;

/**
 * 
 * <p>
 * description:记录性能监视信息
 * </p>
 * 
 * @author coolearth
 * @since 2015年3月13日
 * @version v1.0
 */
public class MethodPerformance {
    private long begin;// 开始执行时间
    private long end;// 结束时间
    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        // TODO Auto-generated constructor stub
        this.serviceMethod = serviceMethod;
        begin = System.currentTimeMillis();
    }

    public void printPerformance() {
        // TODO Auto-generated method stub
        end = System.currentTimeMillis();
        long elapse = end - begin;
        System.out.println(serviceMethod + "花费" + elapse + "毫秒");
    }

}
