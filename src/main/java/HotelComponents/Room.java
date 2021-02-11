package HotelComponents;
import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType, ArrayList<Guest> guests){
        this.roomType = roomType;
        this.guests = guests;
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

}
