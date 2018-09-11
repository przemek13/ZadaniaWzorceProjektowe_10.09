package ZadaniaWzorceProjektowe_10_09.Zadanie1;

public class Pokemon extends BaseModel {
    private String name;
    private int creationYear;
    public Pokemon(String ordinalNumber, String name, int creationYear) {
        super(ordinalNumber);
        this.name = name;
        this.creationYear = creationYear;
    }

    public String getName() {
        return name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", creationYear=" + creationYear +
                ", ordinalNumber='" + ordinalNumber + '\'' +
                '}';
    }
}
