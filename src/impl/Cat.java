package impl;

import Interfaces.Mammal;
import Interfaces.Walk;
import animal.Animal;

public class Cat extends Animal implements Mammal, Walk {

    private boolean itSwims;

    public Cat(String name, String species, boolean isInDanger, boolean itSwims) {
        super(name, species, isInDanger);
        this.itSwims = itSwims;

    }

    public boolean isItSwims() {
        return itSwims;
    }

    public void setItSwims(boolean itSwims) {
        this.itSwims = itSwims;
    }

    @Override
    public void hasPlacenta() {
        System.out.println("The mom eats the placenta");
    }

    @Override
    public void walk() {
        System.out.println("Im walking");

    }

    public Dove eatingDoves(Dove dove) {
        System.out.println("me estoy comiendo un " + dove.getName());
        System.out.println(dove.isInDanger());
        dove.setInDanger(true);
        return dove;

    }


    @Override
    public void emitirSonido() {
        System.out.println("miau");

    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
