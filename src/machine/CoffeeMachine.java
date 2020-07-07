package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int money= 550;
        int water=400;
        int milk=540;
        int beans=120;
        int cups=9;
        String action;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nWrite action (buy, fill, take,remain,exit): ");
            action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String product = scanner.nextLine();
                    switch (product) {
                        case "1":
                            if(water<350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            water -= 250;
                            if(beans<16) {
                                System.out.println("Sorry, not enough coffee!");
                                break;
                            }
                            beans -= 16;
                            money += 4;
                            if(cups==0) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }
                            cups--;
                            break;
                        case "2":
                            if(water<350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            water -= 350;
                            if(milk<75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            milk -= 75;
                            if(beans<20) {
                                System.out.println("Sorry, not enough cofee!");
                                break;
                            }
                            beans -= 20;
                            money += 7;
                            if(cups==0) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }
                            cups--;
                            break;
                        case "3":
                            if(water<200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            water -= 200;
                            if(milk<100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            milk -= 100;
                            if(beans<12) {
                                System.out.println("Sorry, not enough cofee!");
                                break;
                            }
                            beans -= 12;
                            money += 6;
                            if(cups==0) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;}
                            cups--;
                            break;

                    }
                    break;
                case "take":
                    System.out.println("I gave you $"+money);
                    money = 0;
                    break;
                case "fill":
                    System.out.println("\nWrite how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffe beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups do you want to add:");
                    cups += scanner.nextInt();
                    break;

                case "remaining":
                    PrintCoffee(money,water,milk,beans,cups);
                    break;

            }
        }while(!action.equals("exit"));

    }


    public static void PrintCoffee(int money,int water,int milk, int beans,int cups)
    {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water+" of water");
        System.out.println(milk+" of milk");
        System.out.println(beans+" of coffee beans");
        System.out.println(cups+" of disposable cups");
        System.out.println(money+" of money");


    }
}
