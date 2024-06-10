import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's play Rock, Papper, Scissor!!!");

        String[] gameCollection = { "r", "p", "s" };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String computerMove = gameCollection[new Random().nextInt(gameCollection.length)];
            System.out.println("Select your move between r - Rock, p - Papper, s - Scissor");
            String playerMove = "";

            while (true) {
                playerMove = scanner.nextLine();
                if (playerMove.equalsIgnoreCase("r") ||
                        playerMove.equalsIgnoreCase("p") ||
                        playerMove.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println("Invalid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("The game was a Tie.");
            } else if (playerMove.equalsIgnoreCase("r")) {
                if (computerMove.equalsIgnoreCase("p")) {
                    System.out.println("You Lose!!!.");
                } else if (computerMove.equalsIgnoreCase("s")) {
                    System.out.println("You win!!!.");
                }
            } else if (playerMove.equalsIgnoreCase("p")) {
                if (computerMove.equalsIgnoreCase("r")) {
                    System.out.println("You Win!!!.");
                } else if (computerMove.equalsIgnoreCase("s")) {
                    System.out.println("You Lose!!!.");
                }
            } else if (playerMove.equalsIgnoreCase("s")) {
                if (computerMove.equalsIgnoreCase("r")) {
                    System.out.println("You Lose!!!.");
                } else if (computerMove.equalsIgnoreCase("p")) {
                    System.out.println("You Win!!!.");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();

    }
}
