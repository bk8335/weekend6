package card_game;

import card_game.*;
import java.util.*;

public class WinChecker {

  public String winner(Player hand1, Player hand2) {
    if(hand1.sumHand() > hand2.sumHand() ) {
      return "player1";
      }
      return "player2";
  }
}