import HotelComponents.ConferenceRoom;
import HotelComponents.Guest;
import HotelComponents.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(RoomType.WALLACE);
    }

    @Test
    public void hasName() {
        assertEquals("WALLACE", conferenceRoom.getName());
    }
    @Test
    public void getCapacity() {
        assertEquals(150, conferenceRoom.getCapacity());
    }
}

