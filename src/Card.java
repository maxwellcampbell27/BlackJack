public class Card {
    public int value;
    public String name;
    public String suit;

    //todo: make a constructor for the card that has three parama
    //feed the parameters into the instance variables

    public Card(int pValue, int pName, String pSuit){
        value = pValue;
        if(pName == 0){
            name = " Ace ";
            value = 11;
        } else if (pName == 1){
            name = "two";
            value = 2;
        }
        name = int Name;
        suit = pSuit;



    }


    //todo: make a printInfo method that prints the card info
    // the ___ of ___ is worth __ points
    public void printInfo(){

        System.out.println(" The " + name + " of " + suit + " is worth " + value + " points ");


    }




}
