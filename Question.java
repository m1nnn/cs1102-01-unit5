public abstract class Question {
    protected String question;

    public abstract boolean ask();

    public abstract boolean check();

    public static void showResults(int correct, int total) {
        System.out.println("You got " + correct + " out of " + total + " questions correct.");
    }
}
