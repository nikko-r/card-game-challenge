package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    static String[] suits = {"♥","♧","♦","♤"};
    static String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    static ArrayList<Card> deckOfCards = new ArrayList<>();

    public static Card dealCard() {
        Card card = deckOfCards.get(0);
        deckOfCards.remove(deckOfCards.get(0));
        return card;
    }

    static ArrayList<Card> shuffleDeck(){
        return Collections.shuffle(deckOfCards);
    };

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            for (int i2 = 0; i2 < 13; i2++) {
                Card card = new Card(suits[i],cards[i2],(i2+2));
                deckOfCards.add(card);
            }
        }
        System.out.println(deckOfCards.toString());
        //Collections.sort( deckOfCards, (a, b) -> a.getCardFace().compareTo(b.getCardFace()) );
        //Collections.sort( deckOfCards, (a, b) -> a.getCardValue()-(b.getCardValue()) );
        //Collections.sort( deckOfCards, (a, b) -> a.getCardSuit().compareTo(b.getCardSuit()) );

        for(int i = 0;i<9;i++){
            //System.out.println(deckOfCards.get(i).toString());
            //Card first = deckOfCards.get(0);
            deckOfCards.add(deckOfCards.get(0));
            deckOfCards.remove(deckOfCards.get(0));
            //Card last =  deckOfCards.get(deckOfCards.size() -1);
            System.out.println(deckOfCards.toString());

        }
        System.out.println(dealCard());
        System.out.println(deckOfCards.toString());

    }


}
