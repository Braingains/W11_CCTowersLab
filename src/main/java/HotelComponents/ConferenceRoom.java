package HotelComponents;
import java.util.ArrayList;
public class ConferenceRoom extends Room {

    private RoomType roomType;

    public ConferenceRoom(RoomType roomType, ArrayList<Guest> guests){
        super(roomType, guests);
    }

    public RoomType getName() {
        return this.roomType;
    }

    public int getCapacity (){
        return this.roomType.getCapacity();
    }
}