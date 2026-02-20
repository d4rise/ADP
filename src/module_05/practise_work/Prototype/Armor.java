package module_05.practise_work.Prototype;

public class Armor implements Cloneable {

    String name;
    int defense;

    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public Armor clone() {
        return new Armor(name, defense);
    }
}