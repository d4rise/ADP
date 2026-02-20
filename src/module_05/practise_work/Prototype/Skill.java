package module_05.practise_work.Prototype;

public class Skill implements Cloneable {

    String name;

    public Skill(String name) {
        this.name = name;
    }

    public Skill clone() {
        return new Skill(name);
    }
}