public class bankBalance {
    private int balance;
    public bankBalance(int amount){
        this.balance=amount;
    }
    public void withdrawl(int amount) throws Exception {
        if(amount>balance) {
            throw new Exception("low balance");
        }
        balance=balance-amount;
        System.out.println(balance);
    }
}
