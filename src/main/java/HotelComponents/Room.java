package HotelComponents;
import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public int getCapacity(){
        return this.roomType.getCapacity();
    }

    public ArrayList<Guest> getGuests(){
        return this.guests;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public String getName() {
        return this.roomType.toString();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }
}
