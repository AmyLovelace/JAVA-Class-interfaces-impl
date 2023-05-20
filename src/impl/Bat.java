package impl;

import Interfaces.Fly;
import Interfaces.Mammal;
import Interfaces.Walk;
import animal.Animal;

public class Bat extends Animal implements Mammal, Walk, Fly {

    private boolean sucksBlood;

    private boolean hasSonar;

    public Bat(String name, String species, boolean isInDanger, boolean hasSonar, boolean sucksBlood) {
        super(name, species, isInDanger);
        this.hasSonar = hasSonar;
        this.sucksBlood = sucksBlood;


    }

    public boolean isSucksBlood() {
        return sucksBlood;
    }

    public void setSucksBlood(boolean sucksBlood) {
        this.sucksBlood = sucksBlood;
    }

    public boolean isHasSonar() {
        return hasSonar;
    }

    public void setHasSonar(boolean hasSonar) {
        this.hasSonar = hasSonar;
    }

    @Override
    public void fly() {
        System.out.println("I believe i can fly");

    }

    @Override
    public void hasPlacenta() {
        System.out.println("The mom eats the placenta");

    }

    @Override
    public void walk() {
        System.out.println("I'm walking");

    }

    @Override
    public void emitirSonido() {
        System.out.println("rbrbrbrbrb");

    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
