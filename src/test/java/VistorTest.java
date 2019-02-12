import Attractions.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VistorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(20, 180, 100.00);
    }

    @Test
    public void canGetAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(180, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(100.00, visitor.getMoney(), 0.01);
    }
}
