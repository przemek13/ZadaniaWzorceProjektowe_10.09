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

    public void print (WithdrawRequest request, int integer) {
        request.setAmount(request.getAmount() - integer);
        System.out.println("You will receive " + integer + " PLN in " + this.getRole());
        successor.processRequest(request);
    }

    public void processRequest(WithdrawRequest request) {
        if (request.getAmount() <= this.getAllowable()) {
            if (request.getAmount() / getDenomination() == 0) {
                System.out.println("You will receive " + request.getAmount() + " PLN in " + this.getRole());
            } else {
                int integer = (request.getAmount() - ((request.getAmount() % getDenomination())));
                print(request, integer);
            }
        } else if ((successor != null)) {
            int integer = getAllowable();
            print(request, integer);
        }
    }
}