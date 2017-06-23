package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import deck.CardSuit;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/06/2017.
 */

public class DealerTest {

    Dealer dealer;

    @Before
    public void before() {
        dealer = new Dealer();
    }

    @Test
    public void canMakeNewDealers() {
        assertEquals(0, dealer.getDeckSize() );
    }

    @Test
    public void canPopulateDeck() {
        dealer.populateDeck();
        assertEquals(52, dealer.getDeckSize());
    }

    @Test
    public void canDealCard_RemovesFromDeck() {
        dealer.populateDeck();
        Card card = dealer.dealCard();
        assertEquals(51, dealer.getDeckSize());
    }

    @Test
    public void canDealCard_ReturnsValidCard() {
        dealer.populateDeck();
        Card card = dealer.dealCard();
        assertEquals(CardSuit.HEARTS, card.getCardSuit());
    }
}
