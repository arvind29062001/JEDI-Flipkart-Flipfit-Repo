package com.flipfit.client;

import java.util.Scanner;

/**
 * Main client application for FlipFit.
 * This class manages user interactions for logging in, registering, changing passwords,
 * and navigating between different user roles (Customer, Gym Owner, Admin).
 * @author Sanyam Lohan
 */
public class FlipFitApplicationMenu {
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private static final FlipFitAdminMenu adminClient = new FlipFitAdminMenu();
    private static final FlipFitCustomerMenu customerClient = new FlipFitCustomerMenu();
    private static final FlipFitGymOwnerMenu gymOwnerClient = new FlipFitGymOwnerMenu();


    private static void login() {
            System.out.println("Enter your username");
            String username = scanner.next();

            System.out.println("Enter your password");
            String password = scanner.next();

            System.out.println("""
                    Enter you role
                    1) ADMIN
                    2) GYM_OWNER
                    3) CUSTOMER
                    """);

            String roleChoice = scanner.next();

            System.out.println("\n Authenticating \n");

            switch(roleChoice) {
                case "1":
                    adminClient.adminLogin(username, password);
                    break;
                case "2":
                    gymOwnerClient.gymOwnerLogin(username, password);
                    break;
                case "3":
                    customerClient.customerLogin(username, password);
                    break;
                default:
                    System.out.println("Invalid role , try again");
                    break;
            }
    }

    private static void customerRegistration() {
        customerClient.register();
    }

    private static void gymOwnerRegistration() {
        gymOwnerClient.register();
    }

    private static void updatePassword() {
        System.out.println("Updating the password...");
    }

    private static void applicationMenu() {
        while(true) {
            System.out.println("""
                1. Login
                2. Registration of the customer
                3. Registration of the gym owner
                4. Update password
                5. Exit
                """);
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    login();
                    break;
                case "2":
                    customerRegistration();
                    break;
                case "3":
                    gymOwnerRegistration();
                    break;
                case "4":
                    updatePassword();
                    break;
                case "5":
                    System.out.println(" Thank you, Exiting \n");
                    return;
                default:
                    System.out.println(" Invalid choice, please try again\n");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n   Welcome to FlipFit Application  ");
        applicationMenu();
    }
}
