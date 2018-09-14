package ZadaniaWzorceProjektowe_10_09.Zadanie2;

public enum WheelsDimensions {
        SEVENTEEN(17), EIGHTEEN(18), NINETEEN(19), TWENTY(20), TWENTYONE(21);

    private int numVal;

    WheelsDimensions(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
