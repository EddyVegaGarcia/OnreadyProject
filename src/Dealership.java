import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Dealership {

    List<Vehicle> listVehicle = new ArrayList<>();

    Dealership(){

        listVehicle.add(new Auto("Peugeot", "206", 4, 200000.00));
        listVehicle.add(new Moto("Honda", "Titan", 125, 60000.00));
        listVehicle.add(new Auto("Peugeot", "208", 5, 250000.00));
        listVehicle.add(new Moto("Yamaha", "YBR", 160, 80500.50));

    }

    private void printSeparator(){

        System.out.println("=============================");

    }

    public void printListVehicle() {

        Iterator iter = listVehicle.iterator();
        while (iter.hasNext())
            ((Spec)iter.next()).printSpecVehicle();
        this.printSeparator();

    }

    public void printCostlyPriceVehicle() {

        List<Vehicle> listAuxiliarVehicle = listVehicle;
        Collections.sort(listAuxiliarVehicle, Collections.reverseOrder());
        System.out.print("Vehículo más caro: ");
        ((Spec)listAuxiliarVehicle.get(0)).printBrandModelVehicle();

    }

    public void printCheapPriceVehicle() {

        List<Vehicle> listAuxiliarVehicle = listVehicle;
        Collections.sort(listAuxiliarVehicle);
        System.out.print("Vehículo más caro: ");
        ((Spec)listAuxiliarVehicle.get(0)).printBrandModelVehicle();

    }

    public void printModelContainsLetter(String aLetter) {

        System.out.print("Vehículo que contiene en el modelo la letra ‘Y’: ");
        Iterator iter = listVehicle.iterator();
        while (iter.hasNext())
            ((Spec)iter.next()).printModelContainsLetter("Y");
        this.printSeparator();

    }

    public void printFallingPriceVehicle() {

        List<Vehicle> listAuxiliarVehicle = listVehicle;
        Collections.sort(listAuxiliarVehicle, Collections.reverseOrder());
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        Iterator iter = listAuxiliarVehicle.iterator();
        while (iter.hasNext())
            ((Spec)iter.next()).printBrandModelVehicle();

    }
}
