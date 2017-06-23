package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import deck.CardNumber;
import deck.CardSuit;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/06/2017.
 */

public class PlayerTest {
    Player player;

    @Before
    public void before() {
        player = new Player();
    }

    @Test
    public void canDrawCard() {
        player.drawCard(new Card(CardNumber.ACE, CardSuit.SPADES));
        assertEquals(1, player.handCount());
    }

    @Test
    public void canTotalHand() {
        player.drawCard(new Card(CardNumber.TEN, CardSuit.SPADES));
        player.drawCard(new Card(CardNumber.SIX, CardSuit.CLUBS));
        assertEquals(16, player.getTotal());
    }

}
