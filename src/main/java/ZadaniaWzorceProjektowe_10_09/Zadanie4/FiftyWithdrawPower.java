package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public class FiftyWithdrawPower extends WithdrawPower {

    protected final int denomination = 50;
    protected final int allowable = 15;

    @Override
    protected int getDenomination() {
        return denomination;
    }

    @Override
    protected int getAllowable() {
        return BASE * allowable;
    }

    @Override
    protected String getRole() {
        return getDenomination() + " PLN bank notes.";
    }
}
