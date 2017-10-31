package com.example.jamie.cardGames.Blackjack;

import com.example.jamie.cardGames.Card;
import com.example.jamie.cardGames.Deck;
import com.example.jamie.cardGames.Player;

/**
 * Created by jamie on 31/10/2017.
 */

public class Dealer extends Player {
  private Deck deck;

  public Dealer(Deck deck) {
    super("Dealer");
    this.deck = deck;
    shuffle();
  }

  public Card deal() {
    return this.deck.deal();
  }

  public void shuffle() {
    this.deck.shuffle();
  }
}
