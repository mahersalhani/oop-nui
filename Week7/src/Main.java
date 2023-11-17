public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.print();


    }

    public static void printCard(Card card){
        System.out.println(card);
        System.out.println(card.getSuit());
        System.out.println(card.getRank());
        System.out.println(card.getValue());
    }

}
