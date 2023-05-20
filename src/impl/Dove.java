package impl;

import Interfaces.Bird;
import Interfaces.Fly;
import Interfaces.Walk;
import animal.Animal;

public class Dove extends Animal implements Fly, Bird, Walk {

    private boolean itsMonogamous;

    public Dove(String name, String species, boolean isInDanger, boolean itsMonogamous) {
        super(name, species, isInDanger);
        this.itsMonogamous = itsMonogamous;

    }

    public boolean isItsMonogamous() {
        return itsMonogamous;
    }

    public void setItsMonogamous(boolean itsMonogamous) {
        this.itsMonogamous = itsMonogamous;
    }

    @Override
    public boolean hasFeathers() {
        return true;
    }

    @Override
    public void fly() {
        System.out.println("I believe i can fly");

    }

    @Override
    public String toString() {
        return "Dove{" +
                "itsMonogamous=" + itsMonogamous +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", isInDanger=" + isInDanger +
                '}';
    }

    @Override
    public void walk() {
        System.out.println("I'm walking");
    }

    @Override
    public void emitirSonido() {
        System.out.println("grrrrr");

    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
