public class AccountDemo {
    public static void main(String[] args) {
        Account acc1 = new Account("John","Deere");
        Account acc2 = new Account("Fridah","Mathias",20000);
        System.out.print(acc1.toString());
        System.out.print(acc2.toString());
    }
}