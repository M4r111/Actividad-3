import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();

        deck.head();
        deck.pick();

        List<Card> hand = deck.hand();
        if (hand.size() == 5) {
            System.out.println("Mano repartida:");
            for (Card card : hand) {
                System.out.println(card);
            }
        }

        // Marco Gonalez.
    }
}
