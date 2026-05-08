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

        for(int i=0; i < deck.length; i++ ){
            deck[i] = new Card(10, i, "Hearts");
            deck[i].printInfo();

        }

}











}
