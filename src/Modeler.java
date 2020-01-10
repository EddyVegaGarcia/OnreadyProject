public class Modeler {

    public static void main(String[] args) {

        Dealership onready = new Dealership();

        onready.printListVehicle();
        onready.printCostlyPriceVehicle();
        onready.printCheapPriceVehicle();
        onready.printModelContainsLetter("Y");
        onready.printFallingPriceVehicle();

    }

}
