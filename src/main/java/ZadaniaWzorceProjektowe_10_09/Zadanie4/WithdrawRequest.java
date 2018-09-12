package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public class WithdrawRequest {

    private int amount;

    public WithdrawRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
