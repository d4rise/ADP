package module_05.practise_work.Prototype;

public class Test {

    public static void main(String[] args) {

        Character hero = new Character();
        hero.health = 100;
        hero.weapon = new Weapon("Sword", 20);
        hero.armor = new Armor("Steel Armor", 15);
        hero.skills.add(new Skill("Slash"));

        Character clone = hero.clone();
        clone.health = 200;

        System.out.println("Original HP: " + hero.health);
        System.out.println("Clone HP: " + clone.health);
    }
}