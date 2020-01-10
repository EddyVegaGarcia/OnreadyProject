public class Auto extends Vehicle implements Spec{

    public Auto(String aBrandAuto, String aModelAuto, int aNumberDoorAuto, Double aPriceAuto) {

        super( aBrandAuto, aModelAuto, aNumberDoorAuto, aPriceAuto);
    }

    @Override
    public void printSpecVehicle() {
        System.out.println(String.format("Marca: %1$s // Modelo: %2$s // Puertas: %3$d // Precio: $%4$,.2f",
                getBrandVehicle(), getModelVehicle(), getNumberExtraVehicle(), getPriceVehicle()));
    }

}
