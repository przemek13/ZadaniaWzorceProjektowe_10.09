package ZadaniaWzorceProjektowe_10_09.Zadanie1;

public class BaseModel {
    protected String ordinalNumber;

    public BaseModel(String ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }

    public String getOrdinalNumber() {
        return ordinalNumber;
    }

    public void setOrdinalNumber(String ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }
}
