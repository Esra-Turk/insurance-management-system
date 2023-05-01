package models.account.manager;

import models.account.*;
import models.user.User;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    User user;
    Account account;
    private final Scanner scan = new Scanner(System.in);
    private TreeSet<Account> dataList = new TreeSet<>();


    public void createAccount() {
        String name, surname, email, password, job, age, accountType;

        System.out.print("What's your name: ");
        name = scan.nextLine();
        System.out.print("What is your surname: ");
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
                    user = account.getUser();
                    this.account = account;
                    System.out.println("Login success");

                }

            } catch (InvalidAuthenticationException e) {
                System.out.println("The user not found");

            }
        }
    }

    public void userProcess() {
        System.out.println("Hi there!" + user.getName() + "You can select the below sections");

        while (true) {
            String choice;

            System.out.println("1-Show My Info");
            System.out.println("2-Buy Insurance");
            System.out.println("3-Show My Insurance List");
            System.out.println("4-Add Address");
            System.out.println("5-Show All Address");
            System.out.println("q- For exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextLine();

            switch (choice) {
                case "1" -> account.showUserInfo();


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
