package tn.esprit.gestionzoo.main.entites;

public class Penguin extends Aquatic {

    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public Penguin() {

    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
        super(family ,name , age , isMammal ,habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+"swiming depth = "+swimmingDepth;
    }
    @Override
    public void swim(){
        System.out.println("This Penguin animal is swimming");

    }
}
