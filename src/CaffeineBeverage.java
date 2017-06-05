/**
 * Created by Тим on 05.06.2017.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("ВОДУ КИПЯТИМ");
    }

    void pourInCup() {
        System.out.println("В ЧАШКУ ЗАЛИВАЕМ");
    }
}
