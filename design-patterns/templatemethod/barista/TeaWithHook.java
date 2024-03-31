package templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{
    public void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("Adding lemon");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and lemon with your tea ? (y/n)");

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
