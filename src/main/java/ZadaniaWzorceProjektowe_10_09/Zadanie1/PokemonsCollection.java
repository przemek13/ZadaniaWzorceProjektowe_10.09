package ZadaniaWzorceProjektowe_10_09.Zadanie1;

public class PokemonsCollection extends BaseCollection<Pokemon> {
    @Override
    public Iterator<Pokemon> getIterator() {
        return new PokemonIterator();
    }

    private class PokemonIterator implements Iterator<Pokemon> {

        private int positionUp;
        private int positionDown = collection.size() - 1;

        @Override
        public boolean hasNext() {
            return positionUp < collection.size();
        }

        @Override
        public Pokemon next() {
            return this.hasNext() ? collection.get(positionUp++) : null;
        }

        @Override
        public boolean hasPrev() {
            return positionDown >= 0;
        }

        @Override
        public Pokemon prev() {
            return this.hasPrev() ? collection.get(positionDown--) : null;
        }
    }
}
