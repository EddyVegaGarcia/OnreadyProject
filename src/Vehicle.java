public abstract class Vehicle implements Comparable<Vehicle>, Spec{

    String brandVehicle;
    String modelVehicle;
    int numberExtraVehicle;
    Double priceVehicle;

    Vehicle(String aBrandVehicle, String aModelVehicle, int aNumberExtraVehicle, Double aPriceVehicle ){

        brandVehicle = aBrandVehicle;
        modelVehicle = aModelVehicle;
        numberExtraVehicle = aNumberExtraVehicle;
        priceVehicle = aPriceVehicle;

    }

    public String getBrandVehicle() {
        return brandVehicle;
    }

    public String getModelVehicle() {
        return modelVehicle;
    }

    public int getNumberExtraVehicle() {
        return numberExtraVehicle;
    }

    public Double getPriceVehicle() {
        return priceVehicle;
    }

    @Override
    public int compareTo(Vehicle aVehicle) {
        return priceVehicle.compareTo(aVehicle.getPriceVehicle());
    }

    @Override
    public void printBrandModelVehicle() {

        System.out.println(String.format("%1$s %2$s", brandVehicle, modelVehicle));

    }

    @Override
    public void printModelContainsLetter(String aLetter) {
        if(modelVehicle.contains(aLetter)) {System.out.println(String.format("%1$s %2$s $%3$,.2f", brandVehicle,
                modelVehicle, priceVehicle));}
    }

}
