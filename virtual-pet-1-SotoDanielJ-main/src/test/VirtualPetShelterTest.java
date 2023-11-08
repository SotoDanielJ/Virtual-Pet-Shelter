package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

public class VirtualPetShelterTest {
    
    VirtualPet pet1 = new VirtualPet("Bilbo", 50, 50, 50);
    VirtualPet pet2 = new VirtualPet("Gandalf", 50, 50, 50);
    VirtualPet pet3 = new VirtualPet("Elrond", 50, 50, 50);
    VirtualPet pet4 = new VirtualPet("Galadriel", 50, 50, 50);
    VirtualPet pet5 = new VirtualPet("Smeagol", 50, 50, 50);
    
    @Test
    public void testKennels() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addInitialPetsToShelter();
        String expected1 = "Bilbo";
        String expected2 = "Gandalf";
        String expected3 = "Elrond";
        String expected4 = "Galadriel";
        String expected5 = "Smeagol";
    }

    @Test
    public void testList() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.listAllPetsInShelter();
        String expected1 = "Bilbo";
        String expected2 = "Gandalf";
        String expected3 = "Elrond";
        String expected4 = "Galadriel";
        String expected5 = "Smeagol";
    }

    @Test
    public void testTick(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.tickAllPetsInShelter();
        VirtualPet expected1 = pet1;
        VirtualPet expected2 = pet2;
        VirtualPet expected3 = pet3;
        VirtualPet expected4 = pet4;
        VirtualPet expected5 = pet5;
    }

    @Test
    public void testFeed(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Bilbo", 50, 50, 50);
        VirtualPet pet2 = new VirtualPet("Gandalf", 50, 50, 50);
        VirtualPet pet3 = new VirtualPet("Elrond", 50, 50, 50);
        VirtualPet pet4 = new VirtualPet("Galadriel", 50, 50, 50);
        VirtualPet pet5 = new VirtualPet("Smeagol", 50, 50, 50);
        underTest.feedAllPetsInShelter();
        int expected1 = 49;
        int expected2 = 49;
        int expected3 = 49;
        int expected4 = 49;
        int expected5 = 49;
    }
    
    @Test
    public void testWater(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Bilbo", 50, 50, 50);
        VirtualPet pet2 = new VirtualPet("Gandalf", 50, 50, 50);
        VirtualPet pet3 = new VirtualPet("Elrond", 50, 50, 50);
        VirtualPet pet4 = new VirtualPet("Galadriel", 50, 50, 50);
        VirtualPet pet5 = new VirtualPet("Smeagol", 50, 50, 50);
        underTest.waterAllPetsInShelter();
        int expected1 = 49;
        int expected2 = 49;
        int expected3 = 49;
        int expected4 = 49;
        int expected5 = 49;
    }

    @Test
    public void testPlay(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Bilbo", 50, 50, 50);
        VirtualPet pet2 = new VirtualPet("Gandalf", 50, 50, 50);
        VirtualPet pet3 = new VirtualPet("Elrond", 50, 50, 50);
        VirtualPet pet4 = new VirtualPet("Galadriel", 50, 50, 50);
        VirtualPet pet5 = new VirtualPet("Smeagol", 50, 50, 50);
        underTest.playWithAllPets();
        int expected1 = 49;
        int expected2 = 49;
        int expected3 = 49;
        int expected4 = 49;
        int expected5 = 49;
    }
}