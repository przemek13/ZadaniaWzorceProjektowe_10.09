package ZadaniaWzorceProjektowe_10_09;

import ZadaniaWzorceProjektowe_10_09.Zadanie1.BaseCollection;
import ZadaniaWzorceProjektowe_10_09.Zadanie1.Iterator;
import ZadaniaWzorceProjektowe_10_09.Zadanie1.Pokemon;
import ZadaniaWzorceProjektowe_10_09.Zadanie1.PokemonsCollection;

public class App {
    public static void main(String[] args) {
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
    }
}
