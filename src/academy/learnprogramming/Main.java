package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank henrysAccount = new Bank();

        henrysAccount.setAccountNumber(123456);
        System.out.println("Account # " + henrysAccount.getAccountNumber());

        henrysAccount.setBalance(1000);
        System.out.println("Balance = $" + henrysAccount.getBalance());

        henrysAccount.setCustomerName("Henry Phillips");
        System.out.println("Name: " + henrysAccount.getCustomerName());

        henrysAccount.setEmail("designsbyhenryp@gmail.com");
        System.out.println("Email: " + henrysAccount.getEmail());

        henrysAccount.setPhoneNumber("760-985-9718");
        System.out.println("Phone number: " + henrysAccount.getPhoneNumber());

        henrysAccount.depositFunds(1200);
        henrysAccount.withdrawFunds(1000);
    }
}
