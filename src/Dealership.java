import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Dealership {

    List<Vehicle> listVehicle = ArrayList<Vehicle>;

    Dealership(){

        listVehicle.add(new Auto("Peugeot", "206", 4, 200000));
        listVehicle.add(new Moto("Honda", "Titan", 125, 60000));
        listVehicle.add(new Auto("Peugeot", "208", 5, 250000));
        listVehicle.add(new Moto("Yamaha", "YBR", 160, 80500.5));

    }


    public void printListVehicle() {

        Iterator iter = listVehicle.iterator();
        while (iter.hasNext())
            ((Spec)iter.next()).printSpecVehicle();

    }

    public void printCostlyPriceVehicle() {



    }

    public void printCheapPriceVehicle() {



    }

    public void printModelContainsLetter(String aLetter) {



    }

    public void printFallingPriceVehicle() {



    }
}
