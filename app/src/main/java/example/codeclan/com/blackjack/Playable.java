package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 23/06/2017.
 */

public interface Playable {
    void drawCard(Card card);
    int getTotal();

    ArrayList<Card> showHand();

//    public void getHand();
}
