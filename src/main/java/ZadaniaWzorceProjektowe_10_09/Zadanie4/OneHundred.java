package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public class OneHundred extends WithdrawPower {
    @Override
    protected int getDenomination() {
        return 100;
    }

    @Override
    protected int getAllowable() {
        return BASE * 100;
    }

    @Override
    protected String getRole() {
        return "100 PLN bank notes.";
    }
}
