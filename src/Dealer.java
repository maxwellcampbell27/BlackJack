public class Dealer {

    public boolean isOver16;
    public int CardTotal;
    public Card[] hand;
    public boolean isBust;
    public int handIndex = 2;

    public Dealer() {
        isOver16 = false;
        CardTotal = 0;
        isBust = false;
        hand = new Card[11];
    }

    public void addCard(Card card) {
        hand[handIndex] = card;
        handIndex++;
    }

    public void calculateTotal() {
        CardTotal = 0;
        for (int i = 0; i < handIndex; i++) {
            CardTotal += hand[i].value;
        }
        if (CardTotal > 16) {
            isOver16 = true;
        }
        if (CardTotal > 21) {
            isBust = true;
        }
    }

    public void takeTurn(Card[] deck, int deckIndex) {
        while (!isOver16 && !isBust) {
            System.out.println("Dealer hits");
            addCard(deck[deckIndex]);
            deckIndex++;
            calculateTotal();
            printInfo();
        }
        if (isBust) {
            System.out.println("Dealer Busted!");
        } else {
            System.out.println("Dealer stands at: " + CardTotal);
        }
    }

    public void printInfo() {
        System.out.println("Dealer Info:");
        for (int g = 0; g < handIndex; g++) {
            hand[g].printInfo();
        }
        System.out.println("CardTotal: " + CardTotal);
        System.out.println("isBust: " + isBust);
        System.out.println("isOver16: " + isOver16);
    }
}