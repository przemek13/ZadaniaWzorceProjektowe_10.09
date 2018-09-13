package ZadaniaWzorceProjektowe_10_09.Zadanie1;

public interface Iterator <T extends BaseModel> {
    boolean hasNext();
    boolean hasPrev();
    T next();
    T prev();
}
