public class Quiz {
    public static void main(String[] args) {
        Question[] questions = new Question[4];
        questions[0] = new MultipleChoiceQuestion("What is the capital of France?", new String[]{"London", "Paris", "Berlin", "Madrid"}, 1);
        questions[1] = new TrueFalseQuestion("The sun rises in the east.", true);
        questions[2] = new TrueFalseQuestion("The earth is flat.", false);
        questions[3] = new MultipleChoiceQuestion("What is the largest planet in our solar system?", new String[]{"Venus", "Mars", "Jupiter", "Saturn"}, 2);

        int correctCount = 0;
        for (Question question : questions) {
            if (question.check()) {
                correctCount++;
            }
        }

        Question.showResults(correctCount, questions.length);
    }
}
