package tn.esprit.gestionzoo.main.entites;

public class Dolphin extends Aquatic {

     private float swimmingSpeed;



     public Dolphin (){

     }
     public Dolphin(String family, String name, int age, boolean isMammal, String habitat,float swimmingSpeed) {
          super(family ,name , age , isMammal ,habitat);
          this.swimmingSpeed = swimmingSpeed;
     }

     @Override
     public String toString() {
          return super.toString()+"swimiing speed  "+swimmingSpeed;
     }

     public void swim(){
          System.out.println("This dolphin is swimming");
     }


}

