import java.util.Scanner;

public class RockPaperScissors {
    Scanner in = new Scanner(System.in);
    String playAgain;

    public static void StartGame(String playerAInput,String playerBInput)
    {
        if (playerAInput.equalsIgnoreCase("R")) {
            if (playerBInput.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks scissors! Player A wins!!");
            } else if (playerBInput.equalsIgnoreCase("R")) {
                System.out.println("Rock vs Rock it’s a Tie!");
            } else
            {
                System.out.println("Paper covers Rock! Player B wins!!");
            }
        }
        else if (playerAInput.equalsIgnoreCase("P")) {
            if (playerBInput.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors cuts Paper! Player B wins!!");
            }
            else if (playerBInput.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock! Player B wins!!");
            }
            else
            {
                System.out.println("Paper vs Paper it's a Tie!");
            }
        }
        else
        {
            if (playerBInput.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper! Player A wins!!");
            }
            else if (playerBInput.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs Scissors it's a Tie");
            }
            else
            {
                System.out.println("Rocks breaks Scissors! Player B wins");
            }
        }



    }

    public void playerInput()
    {
        String playerAInput, playerBInput;
        for (;; ) {
            for (;; )
            {
                System.out.println("Input your move Player A: ");
                playerAInput = in.next();

                if (playerAInput.equalsIgnoreCase("R") || playerAInput.equalsIgnoreCase("S") || playerAInput.equalsIgnoreCase("P"))
                    break;
                else
                {
                    System.out.println("Input a valid move R, P, or S");
                }
            }
            for (; ; )
            {
                System.out.println("Input your move Player B: ");
                playerBInput = in.next();

                if (playerBInput.equalsIgnoreCase("R") || playerBInput.equalsIgnoreCase("S") || playerBInput.equalsIgnoreCase("P"))
                    break;
                else {
                    System.out.println("Input a valid move R, P, or S");
                }
            }
            StartGame(playerAInput,playerBInput);

            System.out.println("Would you like to play again? (Y/N)");
            playAgain = in.next();

            if (!playAgain.equals("Y"))
                break;
        }
    }

    public static void main (String[] args)
    {
        new RockPaperScissors().playerInput();
            }
        }
    