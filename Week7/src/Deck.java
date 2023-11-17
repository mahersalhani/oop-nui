public class Deck {
    private final Card[] cards;

    public Deck() {
        cards = new Card[52];
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i] = new Card(suit, rank);
                i++;
            }
        }
    }
    public void print(){
        for (Card card : cards) {
            System.out.println(card);
        }
    }

}
