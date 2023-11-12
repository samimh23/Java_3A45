package tn.esprit.gestionzoo.main.entites;

interface Omnivore <T> extends Carnivore<T>,Herbivore<T>{
    void eatPlantAndMeet(T food);
}
