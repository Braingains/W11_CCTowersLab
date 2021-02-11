package HotelComponents;
import java.util.ArrayList;
public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(RoomType roomType, ArrayList<Guest> guests, int roomNumber) {
        super(roomType, guests);
        this.roomNumber = roomNumber;
    }

    public int getCapacity (){
        return this.roomType.getCapacity();
    }

}
