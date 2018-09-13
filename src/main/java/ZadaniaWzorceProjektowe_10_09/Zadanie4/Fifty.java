package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public class Fifty extends WithdrawPower {
    @Override
    protected int getDenomination() {
        return 50;
    }

    @Override
    protected int getAllowable() {
        return BASE * 15;
    }

    @Override
    protected String getRole() {
        return "50 PLN bank notes.";
    }
}
