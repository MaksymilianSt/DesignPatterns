package Builder.Director;

public class BigHouseBuilder implements HouseBuilder {
    private House house;

    public BigHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("big walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms(12);
    }

    @Override
    public void buildDoors() {
        this.house.setDoors(10);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
