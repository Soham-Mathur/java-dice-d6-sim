import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//DECLARATION
        int numOfDice;
        int total;
        String again;

//WELCOME SCREEN
        System.out.println("**==============*WELCOME*==============**");

//LOOP
        do {total =0;

//GET # OF DICE FROM THE USER
            System.out.print("Enter the number of dice you want to roll: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input!! (Please enter a WHOLE number): ");
                scanner.next();     //EAT UP EXTRA
            }
            numOfDice = scanner.nextInt();
            System.out.println();

//CHECK IF #>0
            if (numOfDice > 0) {
//ROLL ALL
                for (int i = 0; i < numOfDice; i++) {
                    int roll = random.nextInt(1, 7);
                    System.out.println("You rolled: " + roll);
                    printDie(roll);
                    total += roll;
                }
//GET TOTAL
                System.out.println("******************");
                System.out.println("Your total was: " + total);
                System.out.println("******************");
            } else {
                System.out.println("Number of dice MUST be greater than zero!!");
            }

//AGAIN?
            System.out.print("\nRoll Again(y/n)? ");
            scanner.nextLine(); // CONSUME NEWLINE LEFT BY nextInt()
            again = scanner.nextLine();
            while (!again.equalsIgnoreCase("y") && !again.equalsIgnoreCase("n")) {
                System.out.print("Invalid input!! (Please enter y or n): ");
                again = scanner.nextLine();
            }

            System.out.println();
            System.out.println("*************************************************************************************************************************");
            System.out.println();
        }  while(again.equalsIgnoreCase("y"));

//END
        System.out.println("THANK YOU FOR VISITING😊!!");
        scanner.close();

    }
//ASCII ART
    static void printDie(int roll) {
        String dice1 = """
                 ---------
                |         |
                |    O    |
                |         |
                 ---------
                """;

        String dice2 = """
                 ---------
                | O       |
                |         |
                |       O |
                 ---------
                """;

        String dice3 = """
                 ---------
                | O       |
                |    O    |
                |       O |
                 ---------
                """;

        String dice4 = """
                 ---------
                | O    O |
                |        |
                | O    O |
                 ---------
                """;

        String dice5 = """
                 ---------
                | O     O |
                |    O    |
                | O     O |
                 ---------
                """;

        String dice6 = """
                 ---------
                | O     O |
                | O     O |
                | O     O |
                 ---------
                """;

        switch(roll){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default-> System.out.println("INVALID ROLL");
        }
    }
}