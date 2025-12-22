import java.util.Scanner;

public static void main(String[] args){
    System.out.println("Welcome to Basic Life Support for Dummies!");
    System.out.println("This program will guide you through the basic steps of life support in an emergency situation.");
    System.out.println("Please enter the number for the choice you would like to make from here on out:" + "\n");
    System.out.println("1. Start Scenario 1");
    System.out.println("2. Start Scenario 2");
    System.out.println("3. Exit Program");

    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();

    if (choice == 1) {
        System.out.println("You have chosen to start Scenario 1." + "\n");

        System.out.println("You see a person on the ground, not moving and not breathing.");
        System.out.println("What would you like to do next?" + "\n" + "1. Ensure Safety" + "\n" + "2. Scream and Run Away" + "\n" + "3. Begin CPR" + "\n");
        int choice2 = scan.nextInt();

        if (choice2 == 1) {
            System.out.println("You have chosen to ensure safety." + "\n");
            System.out.println("You check the area for any potential hazards and find none." + "\n");
            
        } else if (choice2 == 2) {
            System.out.println("You have chosen to scream and run away.");
            System.out.println("You scream for help and run away from the person, who then dies. Whoops." + "\n");
            System.out.println("Always remember to check for safety before attempting to help someone in an emergency. Also, if you don't do anything, hey will not recover. Try again." + "\n");
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }
    } else if (choice == 2) {
        
    } else {
        System.out.println("Invalid choice. Please enter 1 or 2.");
    }
}