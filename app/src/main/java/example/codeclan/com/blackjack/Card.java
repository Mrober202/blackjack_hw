package example.codeclan.com.blackjack;

import deck.CardNumber;
import deck.CardSuit;

/**
 * Created by user on 23/06/2017.
 */

public class Card {

    CardNumber cardNumber;
    CardSuit cardSuit;

    public Card(CardNumber cardNumber, CardSuit cardSuit){
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }

    public CardNumber getCardNumber() {
        return cardNumber;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public int getValue() {
        return cardNumber.getNumber();
    }
}
