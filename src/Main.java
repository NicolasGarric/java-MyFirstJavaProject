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

//        // Apprentissage du scanner || entrée de texte
//
//        Scanner scanner = new Scanner (System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        // Bonne pratique. Appeler la next line pour garder en mémoire la bonne donnée.
//        scanner.nextLine();
//
//        System.out.print("What is your GPA?: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name + " :)");
//        System.out.println("You are " + age + " years old and your GPA is: " + gpa);
//
//        // If statment for student type
//        if (isStudent){
//            System.out.println("You are one of our students :)");
//        } else {
//            System.out.println("You are NOT one of our students!!!");
//        }
//
//        scanner.close();


//        // Calculate area of a rectangle
//
//        double width = 0;
//        double height = 0;
//        double area = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the width: ");
//        width = scanner.nextDouble();
//
//        System.out.print("Enter the height: ");
//        height = scanner.nextDouble();
//
//        area = width * height;
//        System.out.println("Area is: " + area + "cm²");
//
//        scanner.close();
//
//        // Pour créer une entrée de texte en Java il faut faire appel à un Scanner (object)
//        // + ne pas oublier de le fermer à la fin avec un scanner.close();
//
//        // MAD LIBS GAME
//
//        Scanner scanner = new Scanner(System.in);
//
//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//        System.out.print("Enter an adjective (description): ");
//        adjective1 = scanner.nextLine();
//        System.out.print("Enter a noun (animal or person): ");
//        noun1 = scanner.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective2 = scanner.nextLine();
//        System.out.print("Enter a verb end with -ing (action): ");
//        verb1 = scanner.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective3 = scanner.nextLine();
//
//        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
//        System.out.println("In an exhibit, I saw a " + noun1 + ".");
//        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
//        System.out.println("I was " + adjective3 + "!");
//
//        scanner.close();

//        // Arithmetic Opérators
//
//        int x = 10;
//        int y = 2;
//        int z;
//
////        z = x + y;
////        z = x - y;
////        z = x * y;
////        z = x / y;
////        z = x % y; // modulus opérator pour savoir si il reste ou non un entier après division.
////        // pratique pour savoir si le nombre est pair ou non.
//
//        // Fonctionne aussi avec des Augmented Assignment Operators --> x += y; -=; *=; /=; %=;
//
//        // x++; and x--; fonctionne pour + ou - 1
//
//
//
//        // ORDER OF OPERATIONS [ P - E - M - D - A - S ]
//        // Parentesis Exponents Multiplications Divisions Additions Soustactions
//        // Please Excuse My Dope Ass Swag
//
//        double result = 0.0
//
//        System.out.println(result);
//
//
//        // SHOPPING CART PROGRAM
//
//        Scanner scanner = new Scanner(System.in);
//
//        String item;
//        double price;
//        int quantity;
//        char currency = '€';
//        double total;
//
//        System.out.print("What item do you like to buy?: ");
//        item = scanner.nextLine();
//
//        System.out.print("What is the price for each?: ");
//        price = scanner.nextDouble();
//
//        System.out.print("How many would you like?: ");
//        quantity = scanner.nextInt();
//
//        total = price * quantity;
//
//        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
//        System.out.println("Your total is " + total + currency);
//
//        scanner.close();
//
//        // IF STATEMENTS
//
//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        int age;
//        boolean isStudent;
//
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//
//        System.out.print("What is your age?: ");
//        age = scanner.nextInt();
//
//        System.out.print("Are you a student? (true/false): ");
//        isStudent = scanner.nextBoolean();
//
//        // GROUP 1 - NAME
//        if(name.isEmpty()){
//            System.out.println("You didn't enter your name.");
//        } else {
//            System.out.println("Hello " + name);
//        }
//
//        // GROUP 2 - AGE
//        if (age >= 18) {
//            System.out.println("You are an adult :)");
//        } else if(age < 0) {
//            System.out.println("You are not even born :(");
//        } else if (age == 0) {
//            System.out.println("Hello world you are a baby :)");
//        } else {
//            System.out.println("You are a child :)");
//        }
//
//        // GROUP 3 - BOOLEAN
//        if(isStudent){
//            System.out.println("You are a student.");
//        } else {
//            System.out.println("You are not a student.");
//        }
//
//        scanner.close();



    }
}

