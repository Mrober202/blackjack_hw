package deck;

import static android.icu.lang.UCharacter.JoiningGroup.HE;

/**
 * Created by user on 23/06/2017.
 */

public enum CardSuit {
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    SPADES("Spades");


    private String type;

    CardSuit(String type) {
        this.type = type;

    }

    public String getSuit(){
        return type;
    }

    }
