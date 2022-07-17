package minijava;

public class Banking {
    int amount = 1000;
//    int amt;
//    public void initiate(){
//
//    }
    public int getBalance(){
        return amount;
    }
    public void add(int amt){
        if(amt > 0){
            amount = amt+amount;
            System.out.println("***** Amount successfully added in your account *****");
        }else {
            System.out.println("***** Please Enter valid Amount *****");
        }
    }
    public int withdraw(int amt){
        if(amt<amount){
            amount=amount-amt;
        }else {
            System.out.println("Please enter amount within the available balance");
        }
        System.out.println("Your available balance is: ");
        return getBalance();
    }
}
