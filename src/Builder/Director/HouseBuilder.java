package Builder.Director;

public interface HouseBuilder {
    void buildWalls();

    void buildFloors();

    void buildRooms();

    void buildDoors();

    House getHouse();
}
