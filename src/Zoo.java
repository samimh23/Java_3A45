import java.util.Arrays;

public class Zoo {
    Animal [] animals;
    String name;
    String City;
    int nbrCages;

    int nbranimaux;

    public Zoo (){

    }
    public Zoo(String name,String City,int nbrCages){


        animals= new Animal[nbrCages];
        this.name=name;
        this.City=City;
        if(nbrCages<=25){
            this.nbrCages=nbrCages;

        }else {
            throw new IllegalArgumentException("nbr of cages must be 25 or under ");


        }

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
    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbranimaux; i++) {

            if (animals[i].equals(animal)) {
                return i;
            }

        }return -1;





    }

    boolean addAnimal(Animal animal) {

       if (nbranimaux<nbrCages && searchAnimal(animal)==-1 ){

           animals[nbranimaux]=animal;
           System.out.println("the animal is added sucefuly");
           nbranimaux++;
           return true;

       }
           
        else {
           System.out.println("there is no place for this animal or  this animal already exist");
           return false;
       }

    }

    boolean removeAnimal(Animal animal){

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


}
