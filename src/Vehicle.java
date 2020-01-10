public abstract class Vehicle {

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
}
