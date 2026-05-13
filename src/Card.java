public class Card {
    public int value;
    public String name;
    public String suit;

    //todo: make a constructor for the card that has three parama
    //feed the parameters into the instance variables

    public Card(int pValue, int pName, int pSuit){
        if(pName == 0){
            name = "Ace";
            value = 11;
        }
        else if(pName == 1){
            name = "two";
            value = 2;
        }
        else if(pName == 2) {
            name = "three";
            value = 3;
        }
        else if(pName == 3) {
                name = "Four";
                value = 4;
        }
        else if(pName == 4) {
            name = "Five";
            value = 5;
        }
        else if(pName == 5) {
            name = "Six";
            value = 6;
        }
        else if(pName == 6) {
            name = "Seven";
            value = 7;
        }
        else if(pName == 7) {
            name = "Eight";
            value = 8;
        }
        else if(pName == 8) {
            name = "Nine";
            value = 9;
        }
        else if(pName == 9) {
            name = "Ten";
            value = 10;
        }
        else if(pName == 10) {
                name = "Jack";
                value = 10;
        }
        else if(pName == 11) {
            name = "King";
            value = 10;
        }
        else if(pName == 12) {
            name = "Queen";
            value = 10;
        }

            if (pSuit == 0) {
                suit = "Spades";
            } else if (pSuit == 1) {
                suit = "Clovers";
            } else if (pSuit == 2) {
                suit = "Hearts";

            } else if (pSuit == 3) {
                suit = "Diamonds";
            }

            // name = int Name;
            //suit = pSuit;

    }

    //todo: make a printInfo method that prints the card info
    // the ___ of ___ is worth __ points
    public void printInfo(){

        System.out.println(" The " + name + " of " + suit + " is worth " + value + " points ");


    }




}
