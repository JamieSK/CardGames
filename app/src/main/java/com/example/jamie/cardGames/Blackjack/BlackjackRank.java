package com.example.jamie.cardGames.Blackjack;

import com.example.jamie.cardGames.Interfaces.Rankable;

/**
 * Created by jamie on 31/10/2017.
 */

public enum BlackjackRank implements Rankable {
  ACE(11),
  KING(10),
  QUEEN(10),
  JACK(10),
  TEN(10),
  NINE(9),
  EIGHT(8),
  SEVEN(7),
  SIX(6),
  FIVE(5),
  FOUR(4),
  THREE(3),
  TWO(2);

  int value;

  BlackjackRank(int i) {
    this.value = i;
  }

  public int getValue() {
    return value;
  }
}
