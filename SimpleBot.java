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


        // reading a name
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!", name);
    }
}
