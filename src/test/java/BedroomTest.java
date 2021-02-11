import HotelComponents.Bedroom;
import HotelComponents.Guest;
import HotelComponents.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 42069);
        guest = new Guest("Ewan");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }
    @Test
    public void hasRoomNumber(){
        assertEquals(42069, bedroom.getRoomNumber());
    }
    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

}
