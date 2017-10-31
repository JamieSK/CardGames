package com.example.jamie.cardGames.Blackjack;

import com.example.jamie.cardGames.CardGame;
import com.example.jamie.cardGames.Deck;
import com.example.jamie.cardGames.Player;

/**
 * Created by jamie on 31/10/2017.
 */

public class BlackjackGame {
  Player player;
  Dealer dealer;
  Deck deck;
  boolean isWon;

  public BlackjackGame(Player player, Dealer dealer, Deck deck) {
    this.player = player;
    this.dealer = dealer;
    this.deck = deck;
    this.isWon = false;
  }

  public void start() {
    player.takeCard(dealer.deal());
    dealer.takeCard(dealer.deal());
    player.takeCard(dealer.deal());
    dealer.takeCard(dealer.deal());

    compareHands();
  }

  public Player compareHands() {
    if (player.totalHand() > dealer.totalHand()) {
      return player;
    } else {
      return dealer;
    }
  }
}
