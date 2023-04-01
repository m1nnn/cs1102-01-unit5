import java.util.Scanner;

public class TrueFalseQuestion extends Question {
    private boolean answer;

    public TrueFalseQuestion(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean ask() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(question);
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("true") || response.equals("false") || response.equals("t") || response.equals("f") || response.equals("yes") || response.equals("no") || response.equals("y") || response.equals("n")) {
                return response.equals("true") || response.equals("t") || response.equals("yes") || response.equals("y");
            }
        }
    }

    public boolean check() {
        return ask() == answer;
    }
}

