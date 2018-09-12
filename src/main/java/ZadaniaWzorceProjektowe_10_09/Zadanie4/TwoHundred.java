package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public class TwoHundred extends WithdrawPower {
    @Override
    protected int getDenomination() {
        return 200;
    }

    @Override
    protected int getAllowable() {
        return BASE * 40;
    }

    @Override
    protected String getRole() {
        return "200 PLN bank notes.";
    }
}
