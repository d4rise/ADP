package module_07.home_work.Template;

public class Test {

    public static void main(String[] args) {

        System.out.println("Making tea:");
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nMaking coffee:");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\nMaking hot chocolate:");
        Beverage chocolate = new HotChocolate();
        chocolate.prepareRecipe();
    }
}