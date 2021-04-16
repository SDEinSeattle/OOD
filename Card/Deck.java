package OOD.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards;

    private final String id;

    public Deck(final String id) {
        this.id = id;
        cards = new ArrayList<Card>();
    }

    public void init() {
        for (int i = 1; i <= 13; i++) {
            for (Suit s: Suit.values()) {
                cards.add(new Card(s, i));
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            final int random = new Random().nextInt(i + 1);

            final Card temp = cards.get(i);

            cards.set(i, cards.get(random));
            cards.set(random, temp);
        }
    }

    public Card deal() {
        if (cards.isEmpty()) {
            return null;
        }

        int sz = cards.size();
        final Card topCard = cards.remove(sz - 1);

        return topCard;
    }
}
