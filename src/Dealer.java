public class Dealer {
    public boolean isOver16;
    public int CardTotal;
    public Card[] hand;
    public boolean isBust;

    //Constructor
    public Dealer() {


        isOver16 = false;
        CardTotal = 0;
        isBust = false;
        hand = new Card[2];


    }

    public void calculateTotal() {
        CardTotal = 0;
        for (int i = 0; i < hand.length; i++) {
            CardTotal += hand[i].value;
        }
        if (CardTotal > 16) {
            isOver16 = true;
        }
        if (CardTotal > 21) {
            isBust = true;
        }
    }

//

    public void printInfo() {

        System.out.println("Dealer Info:");
        for (int g = 0; g < hand.length; g++) {
            hand[g].printInfo();
        }
        System.out.println("Cardtotal: " + CardTotal);
        System.out.println("isBust: " + isBust);
        System.out.println("isOver16: " + isOver16);



        }
        //todo: Make constructor with no parameters that sets defaults for the instance variables

        //todo: make a print that prints all the instance variables

        //hint you will need a for loop for the hand


    }

