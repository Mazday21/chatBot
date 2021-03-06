package bot;

import java.time.Year;
import java.util.Scanner;

public class SimpleBot {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        hello();
        age();
        count();
    }
    public static void hello() {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in " + Year.now());
        System.out.println("Please, remind me your name.");
        System.out.print("> ");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
    }
    public static void age() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        System.out.print("> ");
        int div3 = scanner.nextInt();
        System.out.print("> ");
        int div5 = scanner.nextInt();
        System.out.print("> ");
        int div7 = scanner.nextInt();
        int age = (div3 * 70 + div5 * 21 + div7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
    public static void count(){
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.print("> ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i+"!");
            }
        System.out.println("Completed, have a nice day!");
    }
}
