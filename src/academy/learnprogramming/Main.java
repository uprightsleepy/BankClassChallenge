package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank henrysAccount = new Bank(72356, 1000.00, "Henry Phillips", "designsbyhenryp@gmail.com",
                "1(760)985-9719");

        System.out.println("Account # " + henrysAccount.getAccountNumber());

        System.out.println("Balance = $" + henrysAccount.getBalance());

        System.out.println("Name: " + henrysAccount.getCustomerName());

        System.out.println("Email: " + henrysAccount.getEmail());

        System.out.println("Phone number: " + henrysAccount.getPhoneNumber());

        henrysAccount.depositFunds(1200);
        henrysAccount.withdrawFunds(1000);
    }
}
