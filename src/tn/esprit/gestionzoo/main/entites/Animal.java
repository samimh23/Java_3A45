package tn.esprit.gestionzoo.main.entites;
public class Animal {

   private String Family;
   private String name;
   private int age ;
   private boolean isMammal;

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;

        }
        else {

            throw new IllegalArgumentException("age must be positve");
        }

    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(){

    }

    public Animal(String Family, String name ,int age ,Boolean isMammal)
    { this.Family=Family;
        this.name=name;
        setAge(age);
        this.isMammal=isMammal;


            }

    @Override
    public String toString() {
        return "Animal{" +
                "Family='" + Family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
