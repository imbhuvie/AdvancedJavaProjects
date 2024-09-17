import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    int numberOfQuestions = 15;
    Question[] questions = new Question[numberOfQuestions];
    Scanner sc = new Scanner(System.in);
    char[] userAnswer = new char[numberOfQuestions];
    ArrayList<Integer> wrongAns = new ArrayList<>();

    QuestionService() {
        questions[0] = new Question(1, "Father of Java?", "Tim Burner", "Steve Jobs", "Games Ghosling",
                "Dennies Ritchie", "C");
        questions[1] = new Question(2, "Java was originally developed by?", "Google", "IBM", "Sun Microsystems",
                "Apple", "C");
        questions[2] = new Question(3, "Which method is used to start a thread in Java?", "start()", "run()", "begin()",
                "init()", "A");
        questions[3] = new Question(4, "Default value of an int variable in Java?", "0", "null", "1", "undefined", "A");
        questions[4] = new Question(5, "Which of the following is not a Java feature?", "Object-oriented",
                "Platform Independent", "Use of pointers", "Multithreading", "C");
        questions[5] = new Question(1, "Size of int in bytes?", "2", "1", "4", "8", "C");
        questions[6] = new Question(2, "Which keyword is used to define a constant in Java?", "static", "final",
                "const", "constant", "B");
        questions[7] = new Question(3, "Which of these is not a Java access modifier?", "private", "protected",
                "public", "global", "D");
        questions[8] = new Question(4, "Which of the following is not a primitive data type in Java?", "int", "boolean",
                "String", "char", "C");
        questions[9] = new Question(5, "Which method is called when an object is created?", "main()", "init()",
                "start()", "constructor", "D");
        questions[10] = new Question(6, "Java was initially called?", "Oak", "Pine", "Maple", "Elm", "A");
        questions[11] = new Question(7, "Which of the following is a superclass of all classes in Java?", "ArrayList",
                "String", "Object", "Thread", "C");
        questions[12] = new Question(8, "Which of these is not a type of loop in Java?", "for", "while", "do-while",
                "repeat-until", "D");
        questions[13] = new Question(9, "Which operator is used to concatenate strings in Java?", "+", "&", "%", "#",
                "A");
        questions[14] = new Question(10, "What is the default value of a boolean variable in Java?", "true", "false",
                "0", "null", "B");

    }

    void displayQuestion() {
        System.out.println("--------------- Quiz -------------------");
        System.out.println("Select right answer and write right option No.");
        int i = 1;
        int ansIndex = 0;
        for (Question q : questions) {
            char j = 'A';
            System.out.println(i++ + ". " + q.getQuestion());
            System.out.println("\t" + j++ + ". " + q.getOption1());
            System.out.println("\t" + j++ + ". " + q.getOption2());
            System.out.println("\t" + j++ + ". " + q.getOption3());
            System.out.println("\t" + j++ + ". " + q.getOption4());
            System.out.print("Your Answer :");
            userAnswer[ansIndex++] = sc.next().charAt(0);

        }

    }

    void result() {
        int score = 0;
        for (int i = 0; i < userAnswer.length; i++) {
            char userAns = Character.toUpperCase(userAnswer[i]);
            char rightAns = questions[i].getAnswer().charAt(0);
            if (userAns == rightAns) {
                score++;
            } else {
                wrongAns.add(i);
            }
        }
        System.out.println("Score :" + score);
        // int size=wrongAns.size();
        // int size = wrongAns.size();
        for(int i:wrongAns){
            System.out.println("Question No."+questions[i].getId()+";  Your Answer is :"+userAnswer[i] +";  Correct Answer is :"+questions[i].getAnswer());
        }

    }
}
