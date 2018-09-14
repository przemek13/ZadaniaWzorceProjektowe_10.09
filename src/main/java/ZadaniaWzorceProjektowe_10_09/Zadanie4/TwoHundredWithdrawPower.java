package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public class TwoHundredWithdrawPower extends WithdrawPower {
    protected final int denomination = 200;
    protected final int allowable = 20;

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
        return + getDenomination() + " PLN bank notes.";
    }
}
