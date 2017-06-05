import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Тим on 05.06.2017.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("\n" + "Капание кофе через фильтр");
    }

    public void addCondiments() {
        System.out.println("С сахаром и молоком");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Ну че? Сахар? Молоко? Сливок нет? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("ОШИБА");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}