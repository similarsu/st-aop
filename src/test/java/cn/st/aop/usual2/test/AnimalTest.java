package cn.st.aop.usual2.test;

import org.junit.Test;

import cn.st.aop.usual2.Animal;
import cn.st.aop.usual2.Cow;
import cn.st.aop.usual2.Horse;

public class AnimalTest {
    @Test
    public void testAnimal() {
        Animal animal = new Cow();
        animal.eat();
        animal.run();
        animal = new Horse();
        animal.eat();
        animal.run();
    }

}
