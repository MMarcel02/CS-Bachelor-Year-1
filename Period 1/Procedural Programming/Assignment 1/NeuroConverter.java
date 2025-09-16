
import java.util.Scanner;

public class NeuroConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your amount?:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        converter(amount);
    }

    public static void converter(double amount) {
        // -- Write your code below
        // Don't forget to print the output [check the requirements]
        // -- Write your code above
        int neuroCoins = (int) amount;
        int centCoins49 = 0;
        int centCoins9 = 0;
        double changeRemaining = amount - neuroCoins;

        while (changeRemaining >= 0.49) {
            changeRemaining -= 0.49;
            centCoins49++;
        }
        while (changeRemaining >= 0.09) {
            changeRemaining -= 0.09;
            centCoins9++;
        }

        System.out.println(neuroCoins + "\n" + centCoins49+ "\n" + centCoins9+ "\n" + (int) (changeRemaining*100));

    }
}
