import java.util.Scanner;
import java.util.Random;

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
//
//        // RANDOM NUMBERS
//
//        Random random = new Random();
//
//        int number1;
//        int number2;
//        int number3;
//
//
//        number1 = random.nextInt(1, 101);
//        number2 = random.nextInt(1, 101);
//        number3 = random.nextInt(1, 101);
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
//
//        // WITH DOUBLES
//        double number4;
//        double number5;
//        double number6;
//
//        number4 = random.nextDouble(1, 101);
//        number5 = random.nextDouble(1, 101);
//        number6 = random.nextDouble(1, 101);
//
//        System.out.println(number4);
//        System.out.println(number5);
//        System.out.println(number6);
//
//        // BOOLEAN
//
//        boolean isHeads;
//
//        isHeads = random.nextBoolean();
//
//        if (isHeads){
//            System.out.println("It's Heads! :)");
//        } else {
//            System.out.println("Yep... it's tails...");
//        }



        // MATH

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

        double result;

//        result = Math.pow(2, 3); // 2 puissance 3
//        result = Math.abs(-5); // absolute value
//        result = Math.sqrt(9); // division par entiers
//        result = Math.round(3.14);
//        result = Math.ceil(3.14);
//        result = Math.floor(3.99);
//        result = Math.min(2, 1000);
//        result = Math.max(2, 1000);
//        System.out.println(result);
//
//        // MATH HYPOTENUSE EXERCICE - c = Math.sqrt(a^2 + b^2)
//
//        Scanner scanner = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side A: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the length of side B: ");
//        b = scanner.nextDouble();
//
////        System.out.println(a);
////        System.out.println(b);
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The hypotenuse (side c) is: " + c + "cm.");
//
//        scanner.close();
//
//        // MATH CERCLE EXERCICE
//
//        Scanner scanner = new Scanner(System.in);
//
//        double radius;
//        double circumference;
//        double area;
//        double volume;
//
//        System.out.print("Enter the radius: ");
//        radius = scanner.nextDouble();
//
//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);
//        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
//
//        // %.1f pour ne prendre qu'une décimale + cm + retour à la ligne avec \n
//        System.out.printf("The circumference is: %.1fcm\n", circumference);
//        System.out.printf("The area is: %.1fcm²\n", area);
//        System.out.printf("The volume is: %.1fcm³\n", volume);
//
//        scanner.close();



    }
}

