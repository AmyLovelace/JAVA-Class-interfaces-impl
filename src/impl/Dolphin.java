package impl;

import Interfaces.Mammal;
import Interfaces.Swim;
import animal.Animal;

public class Dolphin extends Animal implements Swim, Mammal {


    private boolean hasSonar;
    private int age;

    public Dolphin(String name, String species, boolean isInDanger, boolean hasSonar) {
        super(name, species, isInDanger);
        this.hasSonar = hasSonar;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getHasSonar() {
        return hasSonar;
    }

    public void setHasSonar(boolean hasSonar) {
        this.hasSonar = hasSonar;
    }

    @Override
    public void emitirSonido() {
        System.out.println("hihihihihi");
    }

    @Override
    public boolean isAlive() {
        return true;
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
    public void hasPlacenta() {
        System.out.println("The mom eats the placenta.");
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "hasSonar=" + hasSonar +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", isInDanger=" + isInDanger +
                '}';
    }
}
