package animal;

public abstract class Animal {
    protected String name;
    protected String species;
    protected boolean isInDanger;
    public static String belongTo = "Planet earth";

    public Animal(String name, String species, boolean isInDanger) {
        this.name = name;
        this.species = species;
        this.isInDanger = isInDanger;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isInDanger() {
        return isInDanger;
    }

    public void setInDanger(boolean inDanger) {
        isInDanger = inDanger;
    }

    public abstract void emitirSonido();

    public void sleeps() {
        System.out.println(name + " sleeps.");
    }

    public abstract boolean isAlive();


}
