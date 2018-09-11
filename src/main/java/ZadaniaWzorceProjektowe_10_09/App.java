package ZadaniaWzorceProjektowe_10_09;

import ZadaniaWzorceProjektowe_10_09.Zadanie1.*;
import ZadaniaWzorceProjektowe_10_09.Zadanie2.*;

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

    }
}
