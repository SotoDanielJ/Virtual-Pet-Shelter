public class VirtualPet {
    
    private String petName;
    private Integer hunger;
    private Integer thirst;
    private Integer boredom;

    public VirtualPet(String petName, Integer hunger, Integer thirst, Integer boredom) {

        this.petName = petName;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    public Integer getHunger() {
        return hunger;
    }

    public Integer getThirst() {
        return thirst;
    }

    public Integer getBoredom() {
        return boredom;
    }

    public String getPetName() {
        return petName;
    }

    public void tick() {
        hunger++;
        thirst++;
        boredom++;
    }

    public void feedPet() {
        hunger = hunger - 3;
    }

    public void givePetWater() {
        thirst = thirst - 3;
    }

    public void playWithPet() {
        boredom = boredom - 3;
        hunger++;
        thirst++;
    }

    protected boolean dying() {
        return getHunger() < 90 && getThirst() < 90 && getBoredom() < 90;
    }
}
