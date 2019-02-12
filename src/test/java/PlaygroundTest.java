import Attractions.Playground;
import Attractions.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;


    @Before
    public void before(){
        playground = new Playground("Attractions.Playground");
    }

    @Test
    public void hasName() {
        assertEquals("Attractions.Playground", playground.getName());
    }

    @Test
    public void visitorCanEnter(){
        Visitor visitor = new Visitor(12, 130, 10.00);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitorCannotEnter(){
        Visitor visitor = new Visitor(17, 170, 10.00);
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
