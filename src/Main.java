import models.account.Account;
import models.account.manager.AccountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        while (true) {
            Scanner scan = new Scanner(System.in);
            String process, email, password;

            System.out.println("Options\n1-Create Account\n2-Login\n3-Exit\n4-Admin Login");
            System.out.print("Enter the process: ");
            process = scan.nextLine();

            switch (process) {
                case "1" -> manager.createAccount();
                case "2" -> {
                    System.out.print("Enter your email address: ");
                    email = scan.nextLine();
                    System.out.print("Enter your password: ");
                    password = scan.nextLine();
                    manager.login(email, password);
                }
                case "3" -> System.exit(0);
                case "4" -> {
                    System.out.print("Please enter the admin password: ");
                    String password2 = scan.nextLine();
                    if (password2.equals("admin1234")) {
                        System.out.println("Printing all accounts and passwords in the system ...");
                        for (Account a : manager.getDataList())
                            System.out.println("Email : " + a.getUser().getEmail()
                                    + " \nPassword : " + a.getUser().getPassword()
                                    + "\nName: " + a.getUser().getName() + " " + a.getUser().getSurname());

                    }
                }
            }

        }

    }
}