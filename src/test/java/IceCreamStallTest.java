import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Cream", "Steven", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Steven", iceCreamStall.getOwnerName());
    }

    @Test
    public void getParkingSpot(){
        assertEquals(1, iceCreamStall.getParkingSpot());
    }
}
