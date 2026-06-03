public class Player {

    public int Cardtotal;
    public boolean isBust;
    public Card[] hand;
    public boolean isHit;
    public String Name;
    public int cardIndex = 2;

    public Player() {
        Cardtotal = 0;
        isBust = false;
        isHit = false;
        Name = "Name";
        hand = new Card[11];
    }

    public void addCard(Card card) {
        hand[cardIndex] = card;
        cardIndex++;
    }

    public void calculateTotal() {
        int addValue = 0;
        for (int d = 0; d < cardIndex; d++) {
            addValue += hand[d].value;
        }
        if (addValue > 21) {
            for (int d = 0; d < cardIndex; d++) {
                if (hand[d].value == 11) {
                    hand[d].value = 1;
                    addValue -= 10;
                    break;
                }
            }
        }
        Cardtotal = addValue;
        if (Cardtotal > 21) {
            isBust = true;
        }
    }

    public void printInfo() {
        System.out.println("Card Total: " + Cardtotal);
        System.out.println("isBust: " + isBust);
        System.out.println("isHit: " + isHit);
        System.out.println("Name: " + Name);
        for (int s = 0; s < cardIndex; s++) {
            hand[s].printInfo();
        }
    }
}