package Builder;

import Builder.Director.BigHouseBuilder;
import Builder.Director.House;
import Builder.Director.HouseDirector;
import Builder.Director.SmallHouseBuilder;
import Builder.InnerBuilder.InnerBuilder;

public class Usage {
    public static void main(String[] args) {
        InnerBuilder innerBuilder = new InnerBuilder.Builder()
                .bar("bar")
                .foo("foo")
                .build();

        System.out.println(innerBuilder);

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();
        House smallHouse = smallHouseDirector.getHouse();
        System.out.println(smallHouse);

        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();
        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();
        House bigHouse = bigHouseDirector.getHouse();
        System.out.println(bigHouse);
    }
}
