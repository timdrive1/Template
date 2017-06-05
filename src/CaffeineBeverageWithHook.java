/**
 * Created by Тим on 05.06.2017.
 */
public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("КИПЯТИМ");
    }

    void pourInCup() {
        System.out.println("В ЧАШКУ НАЛИВАЕМ");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}