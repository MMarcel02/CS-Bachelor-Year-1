import java.util.Scanner;
import java.util.Random;

public class RPSLO {
    // Rock = 0, Paper = 1, Scissors = 2, Lizard = 3, Spock = 4
    private static final String[] MOVE_NAMES = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};

    // Method to determine the winner
    private static String getResult(int player, int computer) {
        if (player == computer) {
            return "It is a tie!";
        }

        switch (player) {
            case 0: // Rock
                if (computer == 2) return "You win! Rock crushes Scissors";
                if (computer == 3) return "You win! Rock crushes Lizard";
                if (computer == 1) return "Computer wins! Paper covers Rock";
                if (computer == 4) return "Computer wins! Spock vaporizes Rock";
                break;
            case 1: // Paper
                if (computer == 0) return "You win! Paper covers Rock";
                if (computer == 4) return "You win! Paper disproves Spock";
                if (computer == 2) return "Computer wins! Scissors cut Paper";
                if (computer == 3) return "Computer wins! Lizard eats Paper";
                break;
            case 2: // Scissors
                if (computer == 1) return "You win! Scissors cut Paper";
                if (computer == 3) return "You win! Scissors decapitate Lizard";
                if (computer == 0) return "Computer wins! Rock crushes Scissors";
                if (computer == 4) return "Computer wins! Spock smashes Scissors";
                break;
            case 3: // Lizard
                if (computer == 1) return "You win! Lizard eats Paper";
                if (computer == 4) return "You win! Lizard poisons Spock";
                if (computer == 0) return "Computer wins! Rock crushes Lizard";
                if (computer == 2) return "Computer wins! Scissors decapitate Lizard";
                break;
            case 4: // Spock
                if (computer == 0) return "You win! Spock vaporizes Rock";
                if (computer == 2) return "You win! Spock smashes Scissors";
                if (computer == 1) return "Computer wins! Paper disproves Spock";
                if (computer == 3) return "Computer wins! Lizard poisons Spock";
                break;
        }
        return "Error: invalid outcome"; // should never hit
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your play: R, P, S, L, O");

        int playerMoveInt = -1;
        boolean running = true;

        while (running) {
            String playerMove = scanner.next();

            switch (playerMove.toUpperCase()) {
                case "R": playerMoveInt = 0; running = false; break;
                case "P": playerMoveInt = 1; running = false; break;
                case "S": playerMoveInt = 2; running = false; break;
                case "L": playerMoveInt = 3; running = false; break;
                case "O": playerMoveInt = 4; running = false; break;
                default: System.out.println("Invalid input (valid inputs: R, P, S, L, O)");
            }
        }

        Random rand = new Random();
        int computerMove = rand.nextInt(5);

        System.out.println("Computer play is " + MOVE_NAMES[computerMove]);
        System.out.println(getResult(playerMoveInt, computerMove));
    }
}
