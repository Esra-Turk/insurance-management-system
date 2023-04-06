package models.account.manager;

import models.account.*;
import models.user.User;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    private final Scanner scan = new Scanner(System.in);
    private TreeSet<Account> dataList;

    public void createAccount() {
        String name, surname, email, password, job, age, accountType;

        System.out.print("What's your name: ");
        name = scan.nextLine();
        System.out.println("What is your surname: ");
        surname = scan.nextLine();
        System.out.print("Enter your email: ");
        email = scan.nextLine();
        System.out.print("Enter password: ");
        password = scan.nextLine();
        System.out.print("Enter your job: ");
        job = scan.nextLine();
        System.out.print("How old are you: ");
        age = scan.nextLine();

        User user = new User(name, surname, email, password, job, Integer.parseInt(age));

        System.out.print("What type of account do you want? Individual(i) or Enterprise(e): ");
        accountType = scan.nextLine();

        switch (accountType) {
            case "i" -> {
                dataList.add(new Individual(user));
            }
            case "e" -> {
                dataList.add(new Enterprise(user));
            }
        }

    }

    public void login(String email, String password) {
        for (Account account : dataList) {
            try {
                account.login(email, password);
                if (account.loginStatus() == AuthenticationStatus.SUCCESS) {
                    User user = account.getUser();

                    //print user's process

                }

            } catch (InvalidAuthenticationException e) {
                System.out.println("The user not found");

            }
        }
    }

    public TreeSet<Account> getDataList() {
        return dataList;
    }

    public void setDataList(TreeSet<Account> dataList) {
        this.dataList = dataList;
    }
}
