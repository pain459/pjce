public class MeasureAquariumWater {
    public static void main(String[] args) {
        System.out.println("Aquarium water measure for differnt types.");
        System.out.println("Input units in feets.");
        Aquarium type1 = new Aquarium();
        System.out.println("Water required to fill the rectangular aquarium with 0.5 0.5 1 dimensions is "
                + type1.areaofRectangularTank(0.5, 0.5, 1) + " liters");
        // updating the dimensions.
        type1.updateDimentionsOfRectangularTank(1, 1, 2);
        System.out.println("Water required to fill the bow tank aquarium with 2 1 1.25 2  dimensions is "
                + type1.areaOfBowShapedTank(2, 1, 1.25, 2) + " liters");
        System.out.println("Water required to fill the cylinder aquarium with 1 2 dimensions is "
                + type1.areaOfCylinderShapedTank(1, 2) + " liters");
        System.out.println("Water required to fill the rectangular aquarium with updated 1 1 2 dimensions is "
                + type1.areaofRectangularTank() + " liters");
    }
}
