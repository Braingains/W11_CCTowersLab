import HotelComponents.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    @Before
    public void before(){
        Hotel hotel = new Hotel();
        Guest guest = new Guest("Juan");
        Room bedroom = new Bedroom(RoomType.SINGLE, 42069);
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

}
