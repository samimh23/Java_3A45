package tn.esprit.gestionzoo.main.entites;
import java.util.Objects;

public class Zoo  {
    Animal [] animals;
    Aquatic[] aquaticAnimals ;


   private String name;


   private String City;
    final int nbrCages=3;

     public int nbranimaux;
    int nbr_aqu_anim;


    public String getName() {
        return name;
    }

    public void setName(String name)  {
        if (Objects.equals(name, "")){
            throw new IllegalArgumentException("enter an name");
        }
        else {
            this.name = name;
        }

    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Zoo (){

    }


    public Zoo(String name, String City){


        animals= new Animal[nbrCages];
        aquaticAnimals= new Aquatic[10];
        setName(name);
        this.City=City;
        this.nbranimaux=0;
    }

    public void displayZoo(){
        System.out.println("name of the zoo:"+name);
        System.out.println("The city of the zoo: "+City);
        System.out.println("the Zoo have: "+nbrCages+" cages");
        System.out.println("animal: " );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("name of the zoo: ").append(name).append("\n");
        sb.append("city: ").append(City).append("\n");
        sb.append("Number of Cages: ").append(nbrCages).append("\n");
        sb.append("Number of Animals: ").append(nbranimaux).append("\n");

        sb.append("Animals:\n");

        for (int i = 0; i < nbranimaux; i++) {
            sb.append(animals[i]).append("\n");
        }
        for (int i = 0; i < nbr_aqu_anim; i++) {
            sb.append(aquaticAnimals[i]).append("\n");
        }

        return sb.toString();
    }
   public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbranimaux; i++) {

            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }

        }return -1;





    }

   public void addAnimal(Animal animal ) throws ZooFullException,InvalidAgeException {

            if(isZooFull()){
                throw new ZooFullException("zoo is full");

       }
        if (animal.getAge() < 0) {
           throw new InvalidAgeException("Animal age cannot be negative.");
       }



           animals[nbranimaux]=animal;
           System.out.println("the animal is added sucefuly");
           nbranimaux++;
        }

           




    public boolean removeAnimal(Animal animal){

        if (searchAnimal(animal) == -1){
            return false;
        }
        for (int i =searchAnimal(animal) ; i< nbranimaux; i++){
            animals[i] = animals[i+1];
        }
        animals[nbranimaux]= null;
        nbranimaux--;
        return true;

    }

    public boolean isZooFull(){

            return nbranimaux==nbrCages;



    }
   public Zoo comparerZoo(Zoo z1, Zoo z2){
       if(z1.nbranimaux> z2.nbranimaux){
        return z1;
       }else {
           return z2;
       }


    }

    public void addAquaticAnimal(Aquatic aquatic){
        if (nbr_aqu_anim<10)
        { aquaticAnimals[nbr_aqu_anim]=aquatic;
            nbr_aqu_anim++;
            System.out.println("added succesfuly");

        }

        else
        {
            System.out.println("is full ");
        }



    }
    public float maxPenguinSwimmingDepth(  ){

        float max=0;
        for (int i=0; i<nbr_aqu_anim;i++){
            if(aquaticAnimals[i] instanceof Penguin   ){
                Penguin penguin =(Penguin) aquaticAnimals[i];
                float swimmingDepth = penguin.getSwimmingDepth();
                if(swimmingDepth>max){
                    max=swimmingDepth;
                }
            }

        }

        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrpenguin=0;
        int nbrdoplhin=0;
        for(int i=0 ; i<nbr_aqu_anim;i++){
            if(aquaticAnimals[i] instanceof Penguin   ){
                nbrpenguin++;
            }
            else
            {
                nbrdoplhin++;
            }


        }
        System.out.println("nombre de penguin: " + nbrdoplhin);
        System.out.println("nombre de penguin: " + nbrpenguin);
    }





}
