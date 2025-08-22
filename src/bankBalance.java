public class bankBalance {
    private int balance;
    public bankBalance(int amount){
        this.balance=amount;
    }
    public void withdrawal(int amount) throws Exception {
        if(amount>balance) {
            throw new InsufficientFundException();
        }
        balance=balance-amount;
        System.out.println(balance);
    }

}
