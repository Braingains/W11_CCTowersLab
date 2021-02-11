package HotelComponents;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    PRESIDENTIAL(5),
    WALLACE(150),
    BRUCE(200),
    MARY(250),
    THISTLE(500);

    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }


    public int getCapacity() {
        return this.capacity;
    }
}
