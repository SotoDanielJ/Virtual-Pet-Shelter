import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    VirtualPet pet1 = new VirtualPet("Bilbo    ", 50, 50, 50);
    VirtualPet pet2 = new VirtualPet("Gandalf  ", 50, 50, 50);
    VirtualPet pet3 = new VirtualPet("Elrond  ", 50, 50, 50);
    VirtualPet pet4 = new VirtualPet("Galadriel", 50, 50, 50);
    VirtualPet pet5 = new VirtualPet("Smeagol  ", 50, 50, 50);

    private static Map<String, VirtualPet> kennels = new HashMap<>();

    protected void addInitialPetsToShelter() {
        kennels.put(pet1.getPetName(), pet1);
        kennels.put(pet2.getPetName(), pet2);
        kennels.put(pet3.getPetName(), pet3);
        kennels.put(pet4.getPetName(), pet4);
        kennels.put(pet5.getPetName(), pet5);
    }

    protected void listAllPetsInShelter() {

        System.out.println("    NAME\t\t|\tHUNGER\t|\tTHIRST\t|\tBOREDOM\t        |");
        System.out.println("________________________________________________________________________________");
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            System.out.println(pet.getPetName() + "\t\t|\t" + pet.getHunger() + "\t|\t" + pet.getThirst() + "\t|\t"
                    + pet.getBoredom() + "\t\t|");
        }

    }

    protected void listAllPetNamesInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            System.out.println(pet.getPetName());
        }
    }

    protected VirtualPet retrievePetByName(String requestedPetName) {
        VirtualPet pet = null;
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            String petName = mapEntry.getKey();
            if (requestedPetName.equalsIgnoreCase(petName)) {
                pet = mapEntry.getValue();
            }
        }
        return pet;
    }

    protected void addHomelessPetToShelter(VirtualPet homelessPet) {
        kennels.put(homelessPet.getPetName().toLowerCase(), homelessPet);
    }

    protected void giveUpPetForAdoption(String petNameToBeAdopted) {

        kennels.remove(petNameToBeAdopted.toLowerCase());
        if (kennels.isEmpty()) {
            System.out.println("Mission accomplished! All pets have been adopted");
            System.exit(0);
        }
    }

    protected void feedAllPetsInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.feedPet();
        }
    }

    protected void waterAllPetsInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.givePetWater();
        }
    }

    protected void playWithAllPets() {
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.playWithPet();
        }
    }

    protected void tickAllPetsInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.tick();
        }
    }

    protected boolean dying() {
        boolean dying = true;
        for (Map.Entry<String, VirtualPet> mapEntry : kennels.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            if (pet.dying()) {
                dying = false;
                break;

            }
        }
        return dying;
    }

}