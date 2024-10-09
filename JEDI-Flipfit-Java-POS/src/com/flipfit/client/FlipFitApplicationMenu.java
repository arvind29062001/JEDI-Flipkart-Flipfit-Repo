package com.flipfit.client;

import java.util.Scanner;

public class FlipFitApplicationMenu {


    public static Scanner scanner = new Scanner(System.in);
    private static FlipfitAdminMenu adminClient = new FlipfitAdminMenu();
    private static FlipFitCustomerMenu customerClient = new FlipFitCustomerMenu();
    private static FlipfitGymOwnerMenu gymOwnerClient = new FlipfitGymOwnerMenu();

    private static void mainPage() {


        System.out.println("1. Login\n2. CustomerRegistration\n 3.GymOwnerRegistration \n4. Change Password\n5. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                customerRegistration();
                break;
            case 3:
                gymOwnerRegistration();
                break;
            case 4:
                updatePassword();
                break;
            default:
                System.out.println("Invalid choice selected");
                break;
        }
        mainPage();
    }



    private static void login() {
        try {


            System.out.println("Enter your Username");
            String userName = scanner.next();

            System.out.println("Enter your Password");
            String password = scanner.next();

//            System.out.println("Enter your Role");
//            String role = scanner.next();;
            System.out.println("1. Admin\n2. Gym owner\n 3.customer ");
            int choice = scanner.nextInt();


            switch (choice){
                case 1:
                    adminClient.adminLogin(userName,password);
                    break;
                case 2:
                    gymOwnerClient.gymOwnerLogin(userName,password);
                    break;
                case 3:
                    customerClient.customerLogin(userName,password);
                    break;
                default:
                    System.out.println("Invalid Option Selected");
                    break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


    private static void customerRegistration(){
        try {


            System.out.println("Enter your Email");
            String email = scanner.next();

            System.out.println("Enter your name");
            String name = scanner.next();

            System.out.println("Enter your Password");
            String password = scanner.next();

            System.out.println("Enter your mobile number");
            String mobno = scanner.next();

            System.out.println("Enter your Address");
            String address = scanner.next();

            customerClient.customerRegister(email,name, password,mobno,address);
        }catch (Exception e){
            System.out.println("Invalid Option Selected");
        }
    }


    private static void gymOwnerRegistration(){
        try {


            System.out.println("Enter your Email");
            String email = scanner.next();

            System.out.println("Enter your name");
            String name = scanner.next();

            System.out.println("Enter your Password");
            String password = scanner.next();

            System.out.println("Enter your mobile number");
            String mobno = scanner.next();

            System.out.println("Enter your Address");
            String address = scanner.next();

            System.out.println("Enter your Adhar Number");
            String idProof = scanner.next();

            gymOwnerClient.gymOwnerRegister(email,name, password,mobno,address,idProof);
        }catch (Exception e){
            System.out.println("Invalid Option Selected");
        }
    }


    private static void updatePassword(){
        try {




            System.out.println("Enter your Email");
            String email = scanner.next();

            System.out.println("Enter your old Password");
            String oldPassword = scanner.next();

            System.out.println("Enter your new Password");
            String newPassword = scanner.next();

            System.out.println("Enter Suitable option :1. Admin\n2. Gym owner\n 3.customer ");
            int choice = scanner.nextInt();



            switch (choice){
                case 1:
                    adminClient.updatePassword(email,oldPassword,newPassword);
                    break;
                case 2:
                    gymOwnerClient.updatePassword(email,oldPassword,newPassword);
                    break;
                case 3:
                    customerClient.updatePassword(email,oldPassword,newPassword);
                    break;
                default:
                    System.out.println("Invalid Option Selected");
                    break;
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }






    public static void main(String[] args)  {
        System.out.println("Welcome to FlipFit application :-->");
        mainPage();

    }
}
