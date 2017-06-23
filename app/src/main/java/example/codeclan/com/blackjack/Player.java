package example.codeclan.com.blackjack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.jar.Attributes;

import static android.R.attr.name;

/**
 * Created by user on 23/06/2017.
 */

public class Player implements Playable {

    ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public int handCount() {
        return hand.size();
    }

    @Override
    public void drawCard(Card card) {
        hand.add(card);
    }

    @Override
    public int getTotal() {
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
    }
}
