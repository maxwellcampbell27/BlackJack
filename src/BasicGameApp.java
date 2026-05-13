public class BasicGameApp {

public Card[] deck;
public Player p1;
public Dealer d1;
public Boolean gameOn;



    public static void main(String[] args) {


        new BasicGameApp();
    }


    public BasicGameApp(){
        System.out.println("Welcome to Black Jack");
        deck = new Card[52];

        //todo: fill the deck arrauy with your favortie card
        int cardIndex = 0;
        for(int x = 0; x < 4; x++){
        for(int i=0; i < 13; i++) {
            deck[cardIndex] = new Card(10, i,x);
            cardIndex++;
           // deck[i].printInfo();

        }

        }
        shuffle();
        printDeck();


}

public void shuffle(){
for(int w = 0; w <deck.length; w++) {
    int randy = (int)(Math.random()*52 );
    //0-51
    Card helper = deck[randy];
    deck[randy] = deck[w];
    deck[w] = helper;
}
}

    public void printDeck(){
    for(int i = 0; i< deck.length; i++){
        deck[i].printInfo();
}
        System.out.println();

    }




}
