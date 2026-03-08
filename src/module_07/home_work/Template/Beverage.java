package module_07.home_work.Template;

public abstract class Beverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addCondiments();

    boolean customerWantsCondiments(){
        return true;
    }
}