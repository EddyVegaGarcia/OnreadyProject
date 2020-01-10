public class Moto extends Vehicle implements Spec{

    public Moto(String aBrandMoto, String aModelMoto, int aDisplacementMoto, Double aPriceMoto) {

        super(aBrandMoto, aModelMoto, aDisplacementMoto, aPriceMoto);

    }

    @Override
    public void printSpecVehicle() {
        System.out.println(String.format("Marca: %1$s // Modelo: %2$s // Cilindrada: %3$dc // Precio: $%4$,.2f",
                getBrandVehicle(), getModelVehicle(), getNumberExtraVehicle(), getPriceVehicle()));
    }
}
