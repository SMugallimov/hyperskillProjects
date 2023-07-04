package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }
    static void greet(String assistantName, String birthDate){
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthDate +".");
        System.out.println("Please, remind me your name.");
    }
    static void remindName(){
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
    static void guessAge(){
        System.out.println("Let me guess your age.");
        System.out.println("Enter reminders of dividing your age by 3, 5 and 7.");
        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        int age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's good time to start programming!");
    }

    static void count(){
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for(int i = 0; i <= number; i++){
            System.out.printf("%d!\n", i);
        }
    }
    static void test(){
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        int question1 = 1;
        int question2 = 2;
        int question3 = 3;
        int question4 = 4;
        System.out.println(question1 + ". To repeat a statement multiple times.");
        System.out.println(question2 + ". To decompose a program into several small subroutines.");
        System.out.println(question3 + ". To determine the execution time of a program.");
        System.out.println(question4 + ". To interrupt the execution of a program.");
        int answer;
        do {
            answer = scanner.nextInt();
            System.out.println("Please, try again.");
        }
        while (question2 != answer);
    }
    static void end(){
        System.out.println("Congratulations, have a nice day!");
    }
}