package bot;

import java.time.Year;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in "+ Year.now());
        System.out.println("Please, remind me your name.");
        System.out.println("> ");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        System.out.println("> ");
        int div3 = scanner.nextInt();
        System.out.println("> ");
        int div5 = scanner.nextInt();
        System.out.println("> ");
        int div7 = scanner.nextInt();
        int age = (div3 * 70 + div5 * 21 + div7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!", age);
    }
}
