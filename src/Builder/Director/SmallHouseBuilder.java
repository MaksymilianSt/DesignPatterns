package Builder.Director;

public class SmallHouseBuilder implements HouseBuilder {
    private House house;

    public SmallHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("small walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("small floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms(4);
    }

    @Override
    public void buildDoors() {
        this.house.setDoors(2);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
