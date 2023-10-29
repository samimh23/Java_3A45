package tn.esprit.gestionzoo.main.entites;

public class Terrestrial extends Animal {

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
}
