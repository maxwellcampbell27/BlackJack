import java.util.Scanner;

public class BasicGameApp {
    public int losses = 0;
    public int wins = 0;
    public int ties = 0;
    public Card[] deck;
    public Player p1;
    public Dealer d1;
    public Boolean gameOn = true;
    public int deckIndex = 4;

    public static void main(String[] args) {
        new BasicGameApp();
    }


    public BasicGameApp() {
        Scanner s = new Scanner(System.in);
        while(gameOn) {
            System.out.println("Welcome to Black Jack");
            deck = new Card[52];

            int cardIndex = 0;
            for (int x = 0; x < 4; x++) {
                for (int i = 0; i < 13; i++) {
                    deck[cardIndex] = new Card(10, i, x); // Change 1
                    cardIndex++;
                }
            }

            shuffle();
            printDeck();

            // Dealer setup
            d1 = new Dealer();
            d1.hand[0] = deck[2];
            d1.hand[1] = deck[3];
            d1.calculateTotal();
            d1.printInfo();

            // Player setup
            p1 = new Player();
            p1.hand[0] = deck[0];
            p1.hand[1] = deck[1];


            System.out.println("What is your name?");
            String aName = s.nextLine();
            System.out.println(aName);
            p1.Name = aName;
            p1.calculateTotal();
            p1.printInfo();





            // Change 2 - input is now inside the loop
            while (p1.Cardtotal <= 21) {
                System.out.println("Do you want to Hit or Stand?");
                String isHit = s.nextLine();

                if (isHit.equalsIgnoreCase("Hit")) {
                    System.out.println("You chose to hit");
                    p1.addCard(deck[deckIndex]);
                    deckIndex++;
                    p1.calculateTotal();
                    p1.printInfo();
                } else {
                    System.out.println("You chose to stand");
                    break;
                }
            }

            // Change 3 - win/loss check
            if (p1.Cardtotal > 21) {
                System.out.println("You Busted! Went over 21.");
            }

            d1.takeTurn(deck, deckIndex);

            System.out.println("Your total: " + p1.Cardtotal);
            System.out.println("Dealer total: " + d1.CardTotal);

            if (p1.Cardtotal > 21) {
                System.out.println("Dealer wins!");
                losses++;
            } else if (d1.isBust) {
                System.out.println(p1.Name + " wins!");
                wins++;
            } else if (p1.Cardtotal > d1.CardTotal) {
                System.out.println(p1.Name + " wins!");
                wins++;
            } else if (p1.Cardtotal == d1.CardTotal) {
                System.out.println("It's a tie!");
                ties++;
            } else {
                System.out.println("Dealer wins!");
                losses++;
            }


            System.out.println("Would you like to play again? Yes or No");
            String again = s.nextLine();
            if (again.equalsIgnoreCase("No")) {
                gameOn = false;
                System.out.println("Thanks for Playing!");
                System.out.println("Your record: " + wins + " Wins | " + losses + " Losses | " + ties + " Ties  " );
        }

        }
    }


    public void shuffle() {
        for (int w = 0; w < deck.length; w++) {
            int randy = (int) (Math.random() * 52);
            Card helper = deck[randy];
            deck[randy] = deck[w];
            deck[w] = helper;
        }
    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            deck[i].printInfo();
        }
        System.out.println();
    }
}
