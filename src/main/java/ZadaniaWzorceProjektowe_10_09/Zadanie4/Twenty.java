package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public class Twenty extends WithdrawPower {
    @Override
    protected int getDenomination() {
        return 20;
    }

    @Override
    protected int getAllowable() {
        return BASE * 20;
    }

    @Override
    protected String getRole() {
        return "20 PLN bank notes.";
    }
}
