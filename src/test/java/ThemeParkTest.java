import Attractions.Rollercoaster;
import Interfaces.IReviewed;
import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Rollercoaster");
        iceCreamStall = new IceCreamStall("Ice Cream", "Steven", 1);

        themePark = new ThemePark("Alton Towers");
        themePark.addAttraction(rollercoaster);
        themePark.addStall(iceCreamStall);
    }

    @Test
    public void hasAttractions(){
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void hasStalls() {
        assertEquals(1, themePark.countStalls());
    }

    @Test
    public void canGetReviews(){
        rollercoaster.setRating(4);
        ArrayList<IReviewed> result = themePark.getAllReviewed();
        assertEquals(1, result.size());
    }
}
