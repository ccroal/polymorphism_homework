import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    
    CandyFlossStall candyFlossStall;
    
    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy Floss", "David", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Candy Floss", candyFlossStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("David", candyFlossStall.getOwnerName());
    }

    @Test
    public void getParkingSpot(){
        assertEquals(2, candyFlossStall.getParkingSpot());
    }
}
