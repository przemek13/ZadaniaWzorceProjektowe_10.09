package ZadaniaWzorceProjektowe_10_09;

import ZadaniaWzorceProjektowe_10_09.Zadanie1.*;
import ZadaniaWzorceProjektowe_10_09.Zadanie2.*;
import ZadaniaWzorceProjektowe_10_09.Zadanie3.*;
import ZadaniaWzorceProjektowe_10_09.Zadanie4.*;

public class App {
    public static void main(String[] args) {

        //Zadanie1
        System.out.println();
        BaseCollection<Pokemon> pokemonCollection = new PokemonsCollection();
        Pokemon pokemon1 = new Pokemon("1", "Poko poko", 1990);
        Pokemon pokemon2 = new Pokemon("2", "Poko loko", 1991);
        Pokemon pokemon3 = new Pokemon("3", "Poko choco", 1992);
        pokemonCollection.addItem(pokemon1);
        pokemonCollection.addItem(pokemon2);
        pokemonCollection.addItem(pokemon3);
        Iterator<Pokemon> pokemonIterator = pokemonCollection.getIterator();
        while (pokemonIterator.hasNext()) {
            System.out.println(pokemonIterator.next());
        }
        pokemonIterator = pokemonCollection.getIterator();
        while (pokemonIterator.hasPrev()) {
            System.out.println(pokemonIterator.prev());
        }

        System.out.println("________________________________________________________________");

        // Zadanie2
        System.out.println();
        Car car = new BasicCar();
        Car blackColourCar = new ColouredBodyCar(car, "black");
        Car carWithSpoiler = new CarWithSpoiler(car);
        Car fullStackCar = new CarWithSpoiler(new ColouredBodyCar(new ChangedWheelsCar(car, 19), "blue"));
        System.out.println("___________basic___________");
        car.assembleCar();
        System.out.println("___________black___________");
        blackColourCar.assembleCar();
        System.out.println("__________spoiler__________");
        carWithSpoiler.assembleCar();
        System.out.println("_________fullstack_________");
        fullStackCar.assembleCar();

        System.out.println("________________________________________________________________");

        // Zadanie3
        System.out.println();
        Employee topManager = new CompositeEmployee("John Smith", 10000); //root
        Employee manager1 = new CompositeEmployee("Jack Star", 5000);
        Employee manager2 = new CompositeEmployee("Eve Black", 5000);
        topManager.addChild(manager1);
        topManager.addChild(manager2);
        Employee developer1 = new CompositeEmployee("Rick Geek", 2500);
        Employee developer2 = new CompositeEmployee("Ben Smoke", 2500);
        Employee developer3 = new CompositeEmployee("Bill Smile", 2500);
        manager1.addChild(developer1);
        manager1.addChild(developer2);
        manager1.addChild(developer3);
        Employee developer4 = new CompositeEmployee("Pete Rock", 2500);
        Employee developer5 = new CompositeEmployee("Meg Song", 2500);
        Employee developer6 = new CompositeEmployee("Liana Xi", 2500);
        manager2.addChild(developer4);
        manager2.addChild(developer5);
        manager2.addChild(developer6);
        topManager.showMe();

        System.out.println("________________________________________________________________");

        //Zadanie4
        System.out.println();
        WithdrawRequest withdrawRequest = new WithdrawRequest(750);
        TwoHundred twoHundred = new TwoHundred();
        OneHundred oneHundred = new OneHundred();
        Fifty fifty = new Fifty();
        Twenty twenty = new Twenty();
        twoHundred.setSuccessor(oneHundred);
        oneHundred.setSuccessor(fifty);
        fifty.setSuccessor(twenty);
        twoHundred.processRequest(withdrawRequest);
    }
}
