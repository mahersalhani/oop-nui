public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String getValue() {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                ", value=" + getValue() +
                '}';
    }
}


enum Suit {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String description;

    Suit(String description) {
        this.description = description;
    }
}

enum Rank {
    ACE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("20"),
    JACK("11"),
    QUEEN("12"),
    KING("13");

    private final String value;

    Rank(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}