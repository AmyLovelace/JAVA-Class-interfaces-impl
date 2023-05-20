package impl;

import Interfaces.Fish;
import Interfaces.Fly;
import Interfaces.Swim;
import animal.Animal;

public class FliyngFish extends Animal implements Fish, Fly, Swim {


    public FliyngFish(String name, String species, boolean isInDanger) {
        super(name, species, isInDanger);

    }


    @Override
    public boolean hasScales() {
        return true;
    }

    @Override
    public boolean hasTeeth() {
        return false;
    }

    @Override
    public void fly() {
        System.out.println("I believe i can fly");

    }

    public void fly(boolean surface) {
        System.out.println("I'm flying over the ocean");

    }

    @Override
    public void swim() {
        System.out.println("I´m swimming");

    }

    @Override
    public void dive(double meters) {

        System.out.println("I'm diving " + meters + " meters.");

    }

    @Override
    public void emitirSonido() {
        System.out.println("kikiki");

    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return "FliyngFish{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", isInDanger=" + isInDanger +
                '}';
    }
}

