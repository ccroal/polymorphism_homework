import Attractions.Visitor;
import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {


    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tobacco", "Sarah", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Tobacco", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Sarah", tobaccoStall.getOwnerName());
    }

    @Test
    public void getParkingSpot(){
        assertEquals(3, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isAllowedToBuy() {
        Visitor visitor = new Visitor(20, 180, 100.00);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToBuy() {
        Visitor visitor = new Visitor(16, 180, 100.00);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}

