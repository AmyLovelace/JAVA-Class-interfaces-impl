import animal.Animal;
import impl.*;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Bat merlina = new Bat("Merlina", "Bat", false, true, true);

        merlina.emitirSonido();
        merlina.sleeps();
        System.out.println(Bat.belongTo);
        System.out.println(merlina.getSpecies());
        System.out.println(merlina.getName());
        System.out.println(merlina.isInDanger());
        System.out.println(merlina.isAlive());

        System.out.println(merlina.isSucksBlood());
        System.out.println(merlina.isHasSonar());
        merlina.fly();
        merlina.hasPlacenta();

        Cat katiuska = new Cat("Katiuska", "Feline", false, false);

        katiuska.emitirSonido();
        katiuska.sleeps();
        System.out.println(Cat.belongTo);
        System.out.println(katiuska.getSpecies());
        System.out.println(katiuska.getName());
        System.out.println(katiuska.isInDanger());
        System.out.println(katiuska.isAlive());

        katiuska.hasPlacenta();
        katiuska.walk();
        System.out.println(katiuska.isItSwims());

        Dolphin gei = new Dolphin("Gei", "Dolphin", false, true);

        gei.emitirSonido();
        gei.sleeps();
        System.out.println(Dolphin.belongTo);
        System.out.println(gei.getSpecies());
        System.out.println(gei.getName());
        System.out.println(gei.isInDanger());
        System.out.println(gei.isAlive());

        gei.swim();
        gei.dive(12.3);
        gei.hasPlacenta();
        System.out.println(gei.getHasSonar());
        gei.setName("mini willy");
        System.out.println(gei.getName());
        System.out.println(gei.getAge());
        gei.setAge(52);
        System.out.println(gei.getAge());

        Dove birdie = new Dove("Birdie", "Dove", false, true);

        birdie.emitirSonido();
        birdie.sleeps();
        System.out.println(birdie.belongTo);
        System.out.println(birdie.getSpecies());
        System.out.println(birdie.getName());
        System.out.println(birdie.isInDanger());
        System.out.println(birdie.isAlive());

        System.out.println(birdie.hasFeathers());
        birdie.fly();
        birdie.walk();
        System.out.println(birdie.isItsMonogamous());

        Duck debugger = new Duck("Debugger", "Duck", false, true);

        debugger.emitirSonido();
        debugger.sleeps();
        System.out.println(debugger.belongTo);
        System.out.println(debugger.getSpecies());
        System.out.println(debugger.getName());
        System.out.println(debugger.isInDanger());
        System.out.println(debugger.isAlive());


        debugger.fly();
        debugger.swim();
        debugger.dive(12.0);
        debugger.walk();
        System.out.println(debugger.hasFeathers());
        System.out.println(debugger.attacksChildren);

        FliyngFish fishy = new FliyngFish("fishy", "Flying Fish", false);

        fishy.emitirSonido();
        fishy.sleeps();
        System.out.println(fishy.belongTo);
        System.out.println(fishy.getSpecies());
        System.out.println(fishy.getName());
        System.out.println(fishy.isInDanger());
        System.out.println(fishy.isAlive());

        System.out.println(fishy.hasScales());
        System.out.println(fishy.hasTeeth());

        fishy.fly();
        fishy.fly(true);
        fishy.swim();
        fishy.dive(12.00);

        Shark wolly = new Shark("wolly", "Shark", true);

        wolly.emitirSonido();
        wolly.sleeps();
        System.out.println(wolly.belongTo);
        System.out.println(wolly.getSpecies());
        System.out.println(wolly.getName());
        System.out.println(wolly.isInDanger());
        System.out.println(wolly.isAlive());

        System.out.println(wolly.hasScales());
        System.out.println(wolly.hasTeeth());
        wolly.swim();
        wolly.dive(12.90);
        System.out.println(Shark.attacksChildren);

        wolly.eats(debugger);
        wolly.eats(fishy);
        wolly.eats(wolly);
        wolly.eats(birdie);
        wolly.eats(gei);
        wolly.eats(katiuska);
        wolly.eats(merlina);

        Animal guacamole = wolly.eatingfishy(fishy);
        System.out.println(guacamole);
        System.out.println(wolly);

        Dove eaten = katiuska.eatingDoves(birdie);
        System.out.println(eaten);
        System.out.println(birdie);


    }
}