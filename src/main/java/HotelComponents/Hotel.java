package HotelComponents;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void checkInGuest(Guest guest, Room room){
        room.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, Room room){
        room.removeGuest(guest);
    }
}
