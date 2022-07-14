package Com.TDD_Assignment_Singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Singleton_Tests {
	@Test
    public void TestSingletonObject(){

        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        //Passes
        Assert.assertSame("2 objects are same", instance1, instance2);
    }

    @Test
    public void TestgetInstance(){

        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        // Does not pass
        Assert.assertSame(instance1.getInstance('o'), instance2.getInstance('o'));
    }
}


