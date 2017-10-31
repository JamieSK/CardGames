package com.example.jamie.cardGames.Blackjack;

import com.example.jamie.cardGames.Card;
import com.example.jamie.cardGames.Deck;
import com.example.jamie.cardGames.Rank;
import com.example.jamie.cardGames.Suit;

import java.util.ArrayList;

/**
 * Created by jamie on 31/10/2017.
 */

public class BlackjackDeck extends Deck {
  @Override
  public ArrayList<Card> generateDeck() {
    ArrayList<Card> pack = new ArrayList<>();

    for (Suit suit : Suit.values()) {
      for (BlackjackRank rank : BlackjackRank.values()) {
        pack.add(new Card(suit, rank));
      }
    }
    return pack;
  }
}
