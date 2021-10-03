package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        System.out.println("Welcome to the Grocery Stor: ");
        printInstruction();
        boolean quit = false;
        int choice = 0;
        while(quit!=true){
            System.out.println("Please enter your choice, press 0 to see the options ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    showList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("\nEnter your choice:");
        System.out.println("\t0 - To print choice options");
        System.out.println("\t1 - To print the list of grocery items");
        System.out.println("\t2 - To add an item to the grocery list");
        System.out.println("\t3 - To remove an item from the grocery list");
        System.out.println("\t4 - To modify an item from the list");
        System.out.println("\t5 - To search an item");
        System.out.println("\t6 - to quit an application");
    }
    public static void showList(){
        groceryList.showList();

    }
    public static void addItem(){
        System.out.println("Enter the item to be added:");
        String item = scanner.nextLine();
        groceryList.addToTheList(item);
    }
    public static void removeItem(){
        System.out.println("Enter the item no from the below list, which you wish to remove");
        showList();
        int choice = scanner.nextInt();
        groceryList.removeItem(choice);
    }
    public static void  modifyItem(){
        System.out.println("Enter the position from below, which you would like to modify");
        showList();
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the item: ");
        String item = scanner.nextLine();
        groceryList.modifyItem(choice, item);
    }
    public static void searchItem(){
        System.out.println("Enter the item you need to search: ");
        String item = scanner.nextLine();
        groceryList.searchItem(item);
    }
}
