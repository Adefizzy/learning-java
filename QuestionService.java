import java.util.Scanner;

public class QuestionService {

    private Question[] questions = new Question[5];
    private String[] results = new String[5];


    QuestionService() {
        questions[0] = new Question(1, "Whats is your favorite color", "yellow", "blue", "green", "red", "yellow");
        questions[1] = new Question(2, "favorite food", "eba", "rice", "beans", "yam", "rice");
        questions[2] = new Question(3, "favorite country", "Nigeria", "Brazil", "Ghana", "Congo", "Congo");
        questions[3] = new Question(4, "favorite musician", "Bob Marley", "Daddy Shokey", "Aruna", "Sunny Ade",
                "Obesere");
        questions[4] = new Question(5, "favorite Weather", "Raining", "Dry", "Summer", "Hammathan", "Autum");
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        for (Question q : questions) {
            System.out.println(q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            results[index++] = sc.nextLine();
        }
        sc.close();
    }

    protected void getResult() {
        int index = 0;
        int score = 0;
        for (Question q : questions) {
            String answer = q.getAnswer();
            String result = results[index++];
            System.out.println("Result: " + result + "Answer: " + answer);

            if (answer.equalsIgnoreCase(result)){
                score += 1;
            }

        }

        System.out.println("Your score is:  " + score + "/ " + this.questions.length);

    }
}
