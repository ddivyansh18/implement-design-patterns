package templatemethod.barista;
import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee ? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("io error while reading answer" + ioe);
        }
        if(answer == null) {
            return "no";
        }
        return answer;
    }
}
