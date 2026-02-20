package module_05.practise_work.Prototype;
import java.util.*;

public class Character implements Cloneable {

    int health;
    int strength;
    int agility;
    int intelligence;

    Weapon weapon;
    Armor armor;
    List<Skill> skills = new ArrayList<>();

    public Character clone() {

        Character copy = new Character();

        copy.health = health;
        copy.strength = strength;
        copy.agility = agility;
        copy.intelligence = intelligence;

        copy.weapon = weapon.clone();
        copy.armor = armor.clone();

        for (Skill s : skills) {
            copy.skills.add(s.clone());
        }

        return copy;
    }
}