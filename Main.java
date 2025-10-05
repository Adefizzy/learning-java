public class Main {
    public static void main(String[] arg) {
        QuestionService questionService = new QuestionService();

        questionService.playQuiz();
        questionService.getResult();
    }
}