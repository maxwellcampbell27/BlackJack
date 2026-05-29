public class Player {

    public int Cardtotal;
    public boolean isBust;
    public Card[] hand;
    public boolean isHit;
    public String Name;
    public int cardIndex = 2;

    //Constructor
    public Player() {

        Cardtotal = 0;
        isBust = false;
        isHit = false;
        Name = "Name";
        hand = new Card[2];


    }
    //Keeps track of how many cards are in hand

    public void printInfo() {
        System.out.println("Cardtotal" + Cardtotal);
        System.out.println("isBust: " + isBust);
        System.out.println("isHit: " + isHit);
        System.out.println("Name: " + Name);
        for (int s = 0; s < hand.length; s++) {
            hand[s].printInfo();
        }

    }
    public void addCard(Card card){
    card.printInfo();

    Card[]store = hand;
    cardIndex++;
    hand = new Card[cardIndex];

        for (int d = 0; d < store.length; d++){
            hand[d] = store[d];
}
        hand[cardIndex-1] = card;


    }

        public void calculateTotal () {
            int addValue = 0;
            for (int d = 0; d < hand.length; d++) {
                addValue = addValue + hand[d].value;
            }

            Cardtotal = addValue;
        }

//todo: Method called calulate total


        //todo: Make constructor with no parameters that sets defaults for the instance variables

        //todo: make a print that prints all the instance variables
        //hint you will need a for loop for the hand



}

