package tn.esprit.gestionzoo.main.entites;
import java.util.Objects;

public class Zoo {
    Animal [] animals;
   private String name;


   private String City;
    final int nbrCages=25;

    int nbranimaux;

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

        return sb.toString();
    }
   public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbranimaux; i++) {

            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }

        }return -1;





    }

   public boolean addAnimal(Animal animal , Zoo z) {

       if (isZooFull(z) || searchAnimal(animal)!=-1){

           return false;

       }
        animals[nbranimaux]=animal;
        System.out.println("the animal is added sucefuly");
        nbranimaux++;
        return true;
           


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

    public boolean isZooFull(Zoo z1){
        if(z1.nbranimaux==z1.nbrCages){
            return true;


        }

            int x=z1.nbrCages-z1.nbranimaux;
            return false;




    }
   public Zoo comparerZoo(Zoo z1, Zoo z2){
       if(z1.nbranimaux> z2.nbranimaux){
        return z1;
       }else {
           return z2;
       }


    }


}
