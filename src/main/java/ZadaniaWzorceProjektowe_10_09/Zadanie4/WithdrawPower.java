package ZadaniaWzorceProjektowe_10_09.Zadanie4;

public abstract class WithdrawPower {
    protected static final int BASE = 10;
    protected WithdrawPower successor;

    abstract protected int getDenomination();

    abstract protected int getAllowable();

    abstract protected String getRole();

    public void setSuccessor(WithdrawPower successor) {
        this.successor = successor;
    }

    public void processRequest(WithdrawRequest request) {
        if (request.getAmount() <= this.getAllowable()) {
            if (request.getAmount() / getDenomination() == 0) {
                System.out.println("You will receive " + request.getAmount() + " PLN in " + this.getRole());
            } else {
                int integer = (request.getAmount() - ((request.getAmount() % getDenomination())));
                System.out.println("You will receive " + integer + " PLN in " + this.getRole());
                request.setAmount(request.getAmount() - integer);
                successor.processRequest(request);
            }
        } else if ((successor != null)) {
            request.setAmount(request.getAmount() - getAllowable());
            System.out.println("You will receive " + getAllowable() + " PLN in " + this.getRole());
            successor.processRequest(request);
        }
    }
}