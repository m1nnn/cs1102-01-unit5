import java.util.Arrays;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
    private String[] choices;
    private int answer;

    public MultipleChoiceQuestion(String question, String[] choices, int answer) {
        this.question = question;
        this.choices = choices;
        this.answer = answer;
    }

    public boolean ask() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(question);
            for (int i = 0; i < choices.length; i++) {
                System.out.println((i + 1) + ". " + choices[i]);
            }
            String response = scanner.nextLine();
            try {
                int choice = Integer.parseInt(response);
                if (choice >= 1 && choice <= choices.length) {
                    return choice == answer + 1;
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }
    }

    public boolean check() {
        return ask() == true;
    }
}

