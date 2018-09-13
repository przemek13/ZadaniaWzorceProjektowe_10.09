package ZadaniaWzorceProjektowe_10_09.Zadanie1;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCollection<T extends BaseModel> {
    protected List<T> collection = new ArrayList<>();
    public void addItem(T item) {
        this.collection.add(item);
    }
    public abstract Iterator<Pokemon> getIterator();
}
