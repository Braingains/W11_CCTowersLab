import HotelComponents.Bedroom;
import HotelComponents.Guest;
import HotelComponents.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, guests, 42069);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

}
