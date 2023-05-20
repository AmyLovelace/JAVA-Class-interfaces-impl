package impl;

import Interfaces.Bird;
import Interfaces.Fly;
import Interfaces.Swim;
import Interfaces.Walk;
import animal.Animal;

public class Duck extends Animal implements Fly, Walk, Bird, Swim {

    public static boolean attacksChildren;

    public Duck(String name, String species, boolean isInDanger, boolean attacksChildren) {
        super(name, species, isInDanger);
        this.attacksChildren = attacksChildren;


    }

    @Override
    public boolean hasFeathers() {
        return false;
    }

    @Override
    public void fly() {
        System.out.println("I believe i can fly");

    }

    @Override
    public void swim() {
        System.out.println("I´m swimming baby");
    }

    @Override
    public void dive(double meters) {
        System.out.println("I'm diving " + meters + " meters.");

    }

    @Override
    public void walk() {
        System.out.println("I´m walking baby");

    }

    @Override
    public void emitirSonido() {

        System.out.println("cuack cuack");

    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
