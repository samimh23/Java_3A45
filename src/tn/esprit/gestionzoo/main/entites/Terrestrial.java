package tn.esprit.gestionzoo.main.entites;

public  class Terrestrial extends Animal implements Omnivore<Food> {

    protected int nbrLegs;



    public Terrestrial(){

    }



    public Terrestrial(String Family, String name ,int age ,Boolean isMammal,int nbrLegs) {
        super(Family,name,age,isMammal);
       this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString()+" nbr_legs: "+nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {

    }

    @Override
    public void eatPlant(Food plant) {

    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println(food);

    }
}
