package tn.esprit.gestionzoo.main.entites;

import java.util.Objects;

public abstract   class Aquatic extends Animal {

    protected String habitat;



    public Aquatic (){

    }
    public Aquatic(String Family, String name ,int age ,Boolean isMammal,String habitat) {
        super(Family,name,age,isMammal);
        this.habitat=habitat;
    }

    @Override
    public String toString() {
        return super.toString()+"habitat: "+habitat;

    }

    @Override

    public boolean equals(Object o) {
        if (this == o)
        {return true;}
        if (o == null || getClass() != o.getClass())
        {return false;}
        if (!super.equals(o))
        {return false;}
        Aquatic aquatic = (Aquatic) o;
        return Objects.equals(getName(), aquatic.getName()) &&
                Objects.equals(getAge(),aquatic.getAge()) &&
                Objects.equals(habitat, aquatic.habitat);
    }


    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    public abstract void swim();

}
