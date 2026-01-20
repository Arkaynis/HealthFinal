import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    System.out.println("You have chosen to give up." + "\n");
                    System.out.println("You walk away from the person, who then dies. Whoops.");
                    System.out.println("You have to try harder next time. Restart by hitting the play button.");
                } else if (choice4 == 2) {
                    System.out.println("You have chosen to call 911.");
                    System.out.println("You call 911 and provide the necessary information. The operator instructs you to begin CPR." + "\n");
                    System.out.println("What do you do?" + "\n" + "1. Begin chest compressions" + "\n" + "2. Place your knee on the person's chest" + "\n" + "3. Check for a pulse and breathing" + "\n");

                    int choice5 = scan.nextInt();
                    if (choice5 == 1) {
                        System.out.println("You have chosen to begin compressions." + "\n");
                        System.out.println("As you begin CPR, you hear ribs breaking, which wakes up the patient. You find yourself in a legal battle for damages.");
                        System.out.println("Make sure the patient is pulseless before attempting CPR. Restart by hitting the play button." + "\n");
                    }else if (choice5 == 2){
                        System.out.println("You have chosen to put your knee on the patient's chest" + "\n");
                        System.out.println("Literally nothing happens and the patient goes into asystole and promptly dies");
                        System.out.println("What did you think was going to happen? Restart by hitting the play button");
                    }else if (choice5 == 3){
                        System.out.println("You assess the carotid (on the neck) and the radial (below the thumb) arteries and find no pulse. What do you do?" + "\n" + "1. Slap them to wake them up" + "\n" + "2. Start rescue breathing" + "\n" + "3. Begin CPR");

                        int choice6 = scan.nextInt();
                        if (choice6 == 1){
                            System.out.println("You have chosen to slap them to wake them up." + "\n");
                            System.out.println("You slap the person, but they remain unresponsive and in cardiac arrest. Whoops." + "\n");
                            System.out.println("Slapping a person will not help in a cardiac emergency. Restart by hitting the play button." + "\n");
                        }else if (choice6 == 2){
                            System.out.println("You have chosen to start rescue breathing." + "\n");
                            System.out.println("As you begin rescue breathing, the person wakes up and angrily shoves you off of them.");
                            System.out.println("Make sure the patient is pulseless and not breathing before attempting rescue breathing. Also, that's gross. Restart by hitting the play button." + "\n");
                        }else if (choice6 == 3){
                            System.out.println("You have chosen to begin CPR." + "\n");
                            System.out.println("You get ready to perform CPR, but you are unsure of the rate and depth of compressions. Which one is best?" + "\n" + "1. 80-90 compressions a minute at a depth of 1.5 inches" + "\n" + "2. 100-120 compressions per minute at a depth of 2 inches" + "\n" + "3. 60-140 compressions per minute at a depth of 1 inch" + "\n");

                            int choice7 = scan.nextInt();
                            if (choice7 == 1){
                                System.out.println("You have chosen 80-90 compressions a minute at a depth of 1.5 inches." + "\n");
                                System.out.println("Unfortunately, your compressions are too slow and too shallow. The patient does not survive. Whoops." + "\n");
                                System.out.println("The correct rate is 100-120 compressions per minute at a depth of 2 inches. Restart by hitting the play button." + "\n");
                            }else if (choice7 == 2){
                                System.out.println("You have chosen 100-120 compressions per minute at a depth of 2 inches." + "\n");
                                System.out.println("You begin CPR at that rate and depth. You hear crunching sounds, but after a few minutes, you observe the color returning to them, but you still don't see them breathing. What do you do next?" + "\n" + "1. Stop CPR" + "\n" + "2. Continue CPR" + "\n" + "3. Give them water" + "\n");
                                
                                int choice8 = scan.nextInt();
                                if (choice8 == 1){
                                    System.out.println("You have chosen to stop CPR." + "\n");
                                    System.out.println("You stop CPR and the person stops breathing and goes back into cardiac arrest. Whoops." + "\n");
                                    System.out.println("Continue CPR until advanced help arrives or the person starts breathing on their own. Restart by hitting the play button." + "\n");
                                }else if (choice8 == 2){
                                    System.out.println("You have chosen to continue CPR." + "\n");
                                    System.out.println("You continue CPR until advanced help arrives. The person is successfully resuscitated and taken to the hospital for further care. Congratulations!" + "\n");
                                }else if (choice8 == 3){
                                    System.out.println("You have chosen to give them water." + "\n");
                                    System.out.println("As you try to give them water, they choke and go into cardiac arrest again. Whoops." + "\n");
                                    System.out.println("Do not give anything by mouth to an unconscious person. Restart by hitting the play button." + "\n");
                                }
                            }else if (choice7 == 3){
                                System.out.println("You have chosen 60-140 compressions per minute at a depth of 1 inch." + "\n");
                                System.out.println("Unfortunately, your compressions are too shallow. The patient does not survive. Whoops." + "\n");
                                System.out.println("The correct rate is 100-120 compressions per minute at a depth of 2 inches. Restart by hitting the play button." + "\n");   
                            }
                        }
                    }
                } else if (choice4 == 3) {
                    System.out.println("You have chosen to begin mouth-to-mouth resuscitation." + "\n");
                    System.out.println("As you begin mouth-to-mouth resuscitation, the person wakes up and angrily shoves you off of them.");
                    System.out.println("Make sure the patient is pulseless and not breathing before attempting mouth-to-mouth resuscitation. Also, that's gross. Restart by hitting the play button." + "\n");
                }
            } else if (choice3 == 2) {
                System.out.println("You have chosen to start hitting the person." + "\n");
                System.out.println("You start hitting the person, but they remain unresponsive and in cardiac arrest. Whoops." + "\n");
                System.out.println("Hitting a person will not help in a cardiac emergency. Restart by hitting the play button." + "\n");
            }
        } else if (choice2 == 2) {
            System.out.println("You have chosen to scream and run away." + "\n");
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

        System.out.println("You see a person on the ground, not moving and not breathing.");
        System.out.println("What would you like to do next?" + "\n" + "1. Ensure Safety" + "\n" + "2. Scream and Run Away" + "\n" + "3. Begin CPR" + "\n");

        int choice10 = scan.nextInt();
        if (choice10 == 1){
            System.out.println("You have chosen to ensure safety." + "\n");
            System.out.println("You check the area for any potential hazards and find none.");
            System.out.println("What should you do next? " + "\n" + "1. Push them over onto their stomach" + "\n" + "2. Yell at the person" + "\n");

            int choice11 = scan.nextInt();
            if (choice11 == 1){
                System.out.println("You have chosen to push them onto their stomach." + "\n");
                System.out.println("You push the person onto their stomach, but they remain unresponsive and in cardiac arrest. Whoops." + "\n");
                System.out.println("Placing a person in the prone position will not help in a cardiac emergency. Restart by hitting the play button." + "\n");
            }else if (choice11 == 2){
                System.out.println("You have chosen to yell at the person." + "\n");
                System.out.println("You loudly ask if they are okay, but there is no response.");
                System.out.println("What should you do next? " + "\n" + "1. Give up" + "\n" + "2. Call 911" + "\n");

                int choice12 = scan.nextInt();
                if (choice12 == 1){
                    System.out.println("You have chosen to give up." + "\n");
                    System.out.println("You walk away from the person, who then dies. Whoops.");
                    System.out.println("You have to try harder next time. Restart by hitting the play button.");
                }else if (choice12 == 2){
                    System.out.println("You have chosen to call 911.");
                    System.out.println("You call 911 and provide the necessary information. The operator instructs you to begin CPR and find an AED." + "\n");
                    System.out.println("What do you do?" + "\n" + "1. Begin chest compressions" + "\n" + "2. Tell someone else to get an AED" + "\n" + "3. Check for a pulse and breathing" + "\n");

                    int choice13 = scan.nextInt();
                    if (choice13 == 1){
                        System.out.println("You have chosen to begin compressions." + "\n");
                        System.out.println("As you begin CPR, you hear ribs breaking, which wakes up the patient. You find yourself in a legal battle for damages.");
                        System.out.println("Make sure the patient is pulseless before attempting CPR. Restart by hitting the play button." + "\n");
                    }else if (choice13 == 2){
                        System.out.println("You have chosen to tell someone else to get an AED." + "\n");
                        System.out.println("The AED arrives quickly. You apply the AED pads to the person's bare chest as instructed by the device." + "\n");
                        System.out.println("The AED analyzes the heart rhythm and advises a shock. You ensure no one is touching the person and deliver the shock." + "\n");
                        System.out.println("Unfortunatly, the patient did have a pulse and now they actually are in cardiac arrest." + "\n");
                        System.out.println("Make sure the patient is pulseless before using an AED. Restart by hitting the play button." + "\n");
                    }else if (choice13 == 3){
                        System.out.println("You assess the carotid (on the neck) and the radial (below the thumb) arteries and find no pulse. What do you do?" + "\n" + "1. Begin chest compressions" + "\n" + "2. Summon an AED and then begin compressions" + "\n");

                        int choice14 = scan.nextInt();
                        if (choice14 == 1){
                            System.out.println("You have chosen to begin compressions." + "\n");
                            System.out.println("You perform CPR endlessly until advanced help arrives. Unfortunately, the patient does not survive. Whoops." + "\n");
                            System.out.println("Always use an AED as soon as it is available in a cardiac emergency. Restart by hitting the play button." + "\n");
                        }else if (choice14 == 2){
                            System.out.println("You have chosen to summon an AED and then begin compressions." + "\n");
                            System.out.println("The AED arrives quickly. You apply the AED pads to the person's bare chest as instructed by the device." + "\n");
                            System.out.println("The AED analyzes the heart rhythm and advises a shock. What do you do next?" + "\n" + "1. Clear everyone" + "\n" + "2. Deliver the shock" + "\n" + "3. Continue CPR without delivering the shock" + "\n");
                            
                            int choice15 = scan.nextInt();
                            if (choice15 == 1){
                                System.out.println("You have chosen to clear everyone." + "\n");
                                System.out.println("You ensure no one is touching the person and deliver the shock." + "\n");
                                System.out.println("The person is still unconscious and isn't breathing. What do you do next?" + "\n" + "1. Clear everyone" + "\n" + "2. Continue CPR" + "\n" + "3. Disconnect the AED" + "\n");

                                int choice16 = scan.nextInt();
                                if (choice16 == 1){
                                    System.out.println("You have chosen to clear everyone." + "\n");
                                    System.out.println("Nothing changes. The person is still unconscious and isn't breathing.");
                                    System.out.println("Always continue CPR after delivering a shock with an AED. Restart by hitting the play button." + "\n");
                                }else if (choice16 == 2){
                                    System.out.println("You have chosen to continue CPR." + "\n");
                                    System.out.println("You continue CPR until the AED advises another shock. You repeat the process of clearing everyone and delivering the shock." + "\n");
                                    System.out.println("After several cycles, the person regains consciousness and starts breathing on their own. Congratulations!" + "\n");
                                }else if (choice16 == 3){
                                    System.out.println("You have chosen to disconnect the AED." + "\n");
                                    System.out.println("You disconnect the AED, and the person goes back into cardiac arrest and dies. Whoops." + "\n");
                                    System.out.println("Always continue using the AED until advanced help arrives or the person starts breathing on their own. Restart by hitting the play button." + "\n");
                                }
                            }else if (choice15 == 2){
                                System.out.println("You have chosen to deliver the shock without clearing." + "\n");
                                System.out.println("Unfortunately, someone was touching the patient during the shock and they are electrocuted. Whoops." + "\n");
                                System.out.println("Always ensure no one is touching the patient before delivering a shock with an AED. Restart by hitting the play button." + "\n");
                            }else if (choice15 == 3){
                                System.out.println("You have chosen to continue CPR without delivering the shock." + "\n");
                                System.out.println("You pump and pump, but they never regain consciousness." + "\n");
                            System.out.println("Always deliver the shock when advised by the AED. Restart by hitting the play button." + "\n");
                            }
                        }
                    }
                }
            }
        } else if (choice10 == 2) {
            System.out.println("You have chosen to scream and run away." + "\n");
            System.out.println("You scream for help and run away from the person, who then dies. Whoops." + "\n");
            System.out.println("Always remember to check for safety before attempting to help someone in an emergency. Also, if you don't do anything, they will not recover. Restart by hitting the play button." + "\n");  
        } else if (choice10 == 3) {
            System.out.println("You have chosen to begin CPR." + "\n");
            System.out.println("As you begin CPR, you realize you forgot to check for safety first.");
            System.out.println("Unfortunately, you are shot in a drive-by while performing CPR. Whoops." + "\n");
            System.out.println("Always remember to check for safety before attempting to help someone in an emergency. Restart by hitting the play button.");
        }
    } else if (choice1 == 3) {
        System.out.println("Exiting program. Stay safe!");
    }

    scan.close();
    }
}