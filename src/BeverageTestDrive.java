/**
 * Created by Тим on 05.06.2017.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nхерачу чай");
        tea.prepareRecipe();

        System.out.println("\nхерачу кофе");
        coffee.prepareRecipe();


        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nхерачу чай");
        teaHook.prepareRecipe();

        System.out.println("\nхерачу кофе");
        coffeeHook.prepareRecipe();
    }
}