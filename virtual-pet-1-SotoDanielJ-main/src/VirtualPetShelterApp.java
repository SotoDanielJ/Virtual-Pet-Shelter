import java.util.Scanner;

public class VirtualPetShelterApp {
    private static VirtualPetShelter shelter = new VirtualPetShelter();

    public static void main(String[] args) {

        System.out.println("Welcome to Virtual Pet Shelter!");
        System.out.println("");
        System.out.println("Be sure you attend to the pets' needs before any of them reach '100'");
        System.out.println("");
        shelter.addInitialPetsToShelter();

        displayAllPetsInShelter();

        while (!shelter.dying()) {

            Integer userSelection = askUserForPetInteraction();
            performActionOnPet(userSelection);

            displayAllPetsInShelter();

        }
        System.out.println("");
        System.out.println("A pet died! You're fired! ");


    }

    private static void displayAllPetsInShelter() {
        System.out.println("");
        System.out.println(" You currently have the following pets: ");
        System.out.println("");
        shelter.listAllPetsInShelter();

    }

    private static Integer askUserForPetInteraction() {
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("1. Feed all pets");
        System.out.println("2. Give Water to all pets");
        System.out.println("3. Play with the pets");
        System.out.println("4. Admit a new pet");
        System.out.println("5. Give up a pet for adoption");
        System.out.println("6. Quit");

        Scanner scanner = new Scanner(System.in);
        int userSelection = Integer.valueOf(scanner.next());

        return userSelection;
    }

    private static void performActionOnPet(Integer userSelection) {
        if (userSelection.equals(1)) {
            shelter.feedAllPetsInShelter();
            shelter.tickAllPetsInShelter();
            System.out.println("You fed all pets in shelter");
        } else if (userSelection.equals(2)) {
            shelter.waterAllPetsInShelter();
            shelter.tickAllPetsInShelter();
            System.out.println("You watered all pets in shelter");
        } else if (userSelection.equals(3)) {
            shelter.playWithAllPets();
            shelter.tickAllPetsInShelter();
            System.out.println("You played with the pets.");

        } else if (userSelection.equals(4)) {
            VirtualPet newPetToBePlacedInShelter = askUserForNewPetInfo();
            shelter.addHomelessPetToShelter(newPetToBePlacedInShelter);
            shelter.tickAllPetsInShelter();
            System.out.println(newPetToBePlacedInShelter.getPetName() + " has been placed in the shelter");

        } else if (userSelection.equals(5)) {
            System.out.println("Which Pet Would you like to give up for adoption");
            String petToGiveUpForAdoption = askUserWhichPetToInteractWith();
            shelter.giveUpPetForAdoption(petToGiveUpForAdoption);
            shelter.tickAllPetsInShelter();
            System.out.println("A pet named " + petToGiveUpForAdoption + " has been adopted by someone");

        } else if (userSelection.equals(6)) {
            System.out.println("You left the Virtual Pet Shelter. ");
            System.exit(0);
        }


    }

    private static String askUserWhichPetToInteractWith() {

        shelter.listAllPetNamesInShelter();
        Scanner scanner = new Scanner(System.in);
        String userSelection = scanner.next();
        return userSelection;
    }

    private static VirtualPet askUserForNewPetInfo() {
        System.out.println("What is the name of pet being placed in shelter?");
        Scanner scanner = new Scanner(System.in);
        String nameOfNewPet = scanner.next();

        VirtualPet newPet = new VirtualPet(nameOfNewPet, 5, 5, 5);
        return newPet;

    }
}
