public class Account {
    String id;
    String name;
    int balance;
    public Account(String x, String y){
        id = x;
        name = y;
    }
    public Account(String x, String y, int z){
        id = x;
        name = y;
        balance = z;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }  
    public int credit(int amount){
        balance +=amount;
        return balance;
    }
    public int debit(int amount){
        if(amount <= balance){
            balance -=amount ;
        } else{
            System.out.print("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString(){
        return "Account[id " + ", name= " + name + ", balance= " + balance + "}";

   
           }
    }
