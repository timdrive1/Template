import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Тим on 05.06.2017.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("Фигачим пакетик!");
    }

    public void addCondiments() {
        System.out.println("Добавляем лимончик!!!");
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

        System.out.print("Те лемон кинуть? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("Ошиба");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}