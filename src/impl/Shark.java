package impl;

import Interfaces.Fish;
import Interfaces.Swim;
import animal.Animal;

public class Shark extends Animal implements Swim, Fish {


    public static boolean attacksChildren;

    public Shark(String name, String species, boolean isInDanger) {
        super(name, species, isInDanger);
    }

    public void eats(Animal animal) {
        if (this.name != animal.getName()) {
            System.out.println("me estoy comiendo un " + animal.getSpecies() + " " + animal.getName());
        } else {
            System.out.println("tengo hambre");

        }
    }

    public FliyngFish eatingfishy(FliyngFish fishy) {
        System.out.println("me estoy comiendo un " + fishy.getName());
        return fishy;
    }

    @Override
    public void emitirSonido() {
        System.out.println("kekeke");
    }

    @Override
    public boolean isAlive() {
        return true;
    }


    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public boolean hasTeeth() {
        return true;
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");

    }

    @Override
    public void dive(double meters) {
        System.out.println("I'm diving " + meters + " meters.");
    }
}
