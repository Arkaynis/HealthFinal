import java.util.Scanner;

public static void main(String[] args){
    System.out.println("Welcome to Basic Life Support for Dummies!");
    System.out.println("This program will guide you through the basic steps of life support in an emergency situation.");
    System.out.println("Please enter the number for the choice you would like to make from here on out:" + "\n" + "WARNING: THIS PROGRAM DOESN'T CHECK ERRORS, SO PLEASE ENTER VALID INPUTS ONLY." + "\n");
    System.out.println("1. Start Scenario 1");
    System.out.println("2. Start Scenario 2");
    System.out.println("3. Exit Program" + "\n");

    Scanner scan = new Scanner(System.in);
    int choice1 = scan.nextInt();

    if (choice1 == 1) {
        System.out.println("You have chosen to start Scenario 1." + "\n");

        System.out.println("You see a person on the ground, not moving and not breathing.");
        System.out.println("What would you like to do next?" + "\n" + "1. Ensure Safety" + "\n" + "2. Scream and Run Away" + "\n" + "3. Begin CPR" + "\n");
        int choice2 = scan.nextInt();

        if (choice2 == 1) {
            System.out.println("You have chosen to ensure safety." + "\n");
            System.out.println("You check the area for any potential hazards and find none.");
            System.out.println("What should you do next? " + "\n" + "1. Yell at the person" + "\n" + "2. Start hitting the person" + "\n");

            int choice3 = scan.nextInt();
            if (choice3 == 1) {
                System.out.println("You have chosen to yell at the person." + "\n");
                System.out.println("You loudly ask if they are okay, but there is no response.");
                System.out.println("What should you do next? " + "\n" + "1. Give up" + "\n" + "2. Call 911" + "\n" + "3. Begin mouth-to-mouth resuscitation" + "\n");

                int choice4 = scan.nextInt();
                if (choice4 == 1) {
                    System.out.println("You have chosen to give up.");
                    System.out.println("You walk away from the person, who then dies. Whoops.");
                    System.out.println("You have to try harder next time. Restart by hitting the play button.");
                } else if (choice4 == 2) {
                    System.out.println("You have chosen to call 911.");
                    System.out.println("You call 911 and provide the necessary information. The operator instructs you to begin CPR." + "\n");
                    System.out.println("What do you do?" + "\n" + "1. Begin chest compressions" + "\n" + "2. Place your knee on the person's chest" + "\n" + "3. Check for a pulse and breathing" + "\n");

                    int choice5 = scan.nextInt();
                    if (choice5 == 1) {
                        System.out.println("You have chosen to begin compressions.");
                        System.out.println("As you begin CPR, you hear ribs breaking, which wakes up the patient. You find yourself in a legal battle for damages.");
                        System.out.println("Make sure the patient is pulseless before attempting CPR. Restart by hitting the play button." + "\n");
                    }else if (choice5 == 2){
                        System.out.println("You have chosen to put your knee on the patient's chest");
                        System.out.println("Literally nothing happens and the patient goes into asystole and promptly dies");
                        System.out.println("What did you think was going to happen? Restart by hitting the play button");
                    }else if (choice5 == 3){
                        System.out.println("You assess the carotid (on the neck) and the radial (below the thumb) arteries and find no pulse. What do you do?" + "\n" + "1. Slap them to wake them up" + "\n" + "2. Start rescue breathing" + "\n" + "3. Begin CPR");

                        int choice6 = scan.nextInt();
                        if (choice6 == 1){

                        }else if (choice6 == 2){

                        }else if (choice6 == 3){

                        }
                    }
                } else if (choice4 == 3) {
                    System.out.println("You have chosen to begin mouth-to-mouth resuscitation.");
                    System.out.println("As you begin mouth-to-mouth resuscitation, the person wakes up and angrily shoves you off of them.");
                    System.out.println("Make sure the patient is pulseless and not breathing before attempting mouth-to-mouth resuscitation. Also, that's gross. Restart by hitting the play button." + "\n");
                }
            } 
        }else if (choice2 == 2) {
            System.out.println("You have chosen to scream and run away.");
            System.out.println("You scream for help and run away from the person, who then dies. Whoops." + "\n");
            System.out.println("Always remember to check for safety before attempting to help someone in an emergency. Also, if you don't do anything, they will not recover. Restart by hitting the play button." + "\n");  
        }else if (choice2 == 3) {
            System.out.println("You have chosen to begin CPR." + "\n");
            System.out.println("As you begin CPR, you realize you forgot to check for safety first.");
            System.out.println("Unfortunately, you are shot in a drive-by while performing CPR. Whoops." + "\n");
            System.out.println("Always remember to check for safety before attempting to help someone in an emergency. Restart by hitting the play button.");
        }
    } else if (choice1 == 2) {
        System.out.println("You have chosen to start Scenario 2." + "\n");
    }else{
        System.out.println("Exiting program. Stay safe!");
    }

    scan.close();
}
