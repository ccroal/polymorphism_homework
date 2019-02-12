import Attractions.Rollercoaster;
import Attractions.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Space Mountain");
    }

    @Test
    public void hasName() {
        assertEquals("Space Mountain", rollercoaster.getName());
    }

    @Test
    public void isAllowedToRide() {
        Visitor visitor = new Visitor( 20, 180, 100.00);
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToRide() {
        Visitor visitor = new Visitor(10, 150, 100.00);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }
}
