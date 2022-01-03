public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Terry Winter-handle",2500);

        bankAccount.withdraw(500);
        bankAccount.deposit(10000);
        bankAccount.withdraw(3000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
