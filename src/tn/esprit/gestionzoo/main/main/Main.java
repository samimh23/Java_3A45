package tn.esprit.gestionzoo.main.main;
import tn.esprit.gestionzoo.main.entites.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal lion=new Animal("Tigers","so",-5,true);
        Animal Tuna =new Animal("Fish","yo",2,true);
        Animal Elephant=new Animal("mamal","sars",2,true);
        Animal Elephant1=new Animal("mamal","sars",2,true);

        Zoo myzoo =new Zoo("myZoo","Belvedaire");
        Zoo myzoo1 =new Zoo("myzoo1","Ariana");

        Aquatic dolphin = new Dolphin("Fish", "Sardine", 2, true, "Sea",48.9f);
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        //Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Aquatic penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        try {
            myzoo.addAnimal(lion);
            System.out.println("nbr animaux ="+myzoo.nbranimaux);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


        try {
            myzoo.addAnimal(Elephant);
            System.out.println("nbr animaux ="+myzoo.nbranimaux);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            myzoo.addAnimal(Elephant1);
            System.out.println("nbr animaux ="+myzoo.nbranimaux);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            myzoo.addAnimal(Tuna);
            System.out.println("nbr animaux ="+myzoo.nbranimaux);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());


        }


        System.out.println(myzoo);

        Aquatic aquatic = new Dolphin("houta", "rchid", 2, false, "bhar",12f);
        aquatic.eatMeat(Food.MEAT);


        Penguin penguin12 = new Penguin("Pen", "dhd", 3, true, "tunis", 17.5f);
        penguin12.eatMeat(Food.MEAT);
        penguin12.swim();

        Terrestrial terrestrial12 = new Terrestrial("Yekel", "hmed", 5, true, 10);
        terrestrial12.eatMeat(Food.MEAT);
        terrestrial12.eatPlantAndMeet(Food.BOTH);





        

       /* System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        aquatic.swim();
        dolphin.swim();
        penguin.swim();*/



        //addd animals
/*
        myzoo.addAnimal(lion,myzoo);
        myzoo.addAnimal(Tuna,myzoo);
        myzoo.addAnimal(Elephant,myzoo);
        myzoo.addAnimal(penguin,myzoo);

        //adding an already existing animal
        System.out.println(myzoo.addAnimal(Elephant1,myzoo));
        System.out.println("\n");
        //display of the zoo
        System.out.println(myzoo);
        System.out.println("\n");
        //search of the desired animal
        System.out.println(myzoo.searchAnimal(lion));
        //Deleting
        System.out.println(myzoo.removeAnimal(lion));
        //Dispaly of the chenges
        System.out.println(myzoo);
        System.out.println(myzoo.isZooFull());
        System.out.println();
        System.out.println(myzoo.comparerZoo(myzoo,myzoo1));
        */













    }
}