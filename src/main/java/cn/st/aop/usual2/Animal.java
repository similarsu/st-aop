package cn.st.aop.usual2;

public abstract class Animal {
    public void eat() {
        System.out.println(this.getClass().getName() + " eat!");
    }

    public void run() {
        System.out.println(this.getClass().getName() + " run!");
    }
}
