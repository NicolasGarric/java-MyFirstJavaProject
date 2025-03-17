import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Basic tests
//
//        System.out.print("Test...\n");
//
//        // Integer
//        int year = 2025;
//        System.out.println("We are in " + year + " youpi :) !");
//
//        // Double
//        double price = 12.60;
//        double temperature = -12.5;
//        System.out.print("Price: ");
//        System.out.println(price + "€");
//
//        // Char
//        char grade = 'A';
//        char symbol = '!';
//        char currency = '€';
//        System.out.println("Your grade is " + grade + symbol);
//        System.out.println("You will be payed " + price + currency);
//
//        // String
//        String myName = "Nicolas";
//        String favoriteFood = "quiche";
//        System.out.println(myName + " loves " + favoriteFood + symbol);
//
//

        // Apprentissage du scanner || entrée de texte

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Hello " + name + " :)");

        scanner.close();
    }
}

