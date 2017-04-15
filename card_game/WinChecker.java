package card_game;

import card_game.*;
import java.util.*;

public class WinChecker {

  public String twoPlayerWinner(Player hand1, Player hand2) {
    if(hand1.sumHand() > hand2.sumHand() ) {
      return hand1.getName() ;
      }
      return hand2.getName() ;
  }

//   public String multiplayerWinner(ArrayList<players>)
//   listOfScores = []
//   for(player : players) {
//     listOfScores += player.sumHand
//   }
//   listOfScores.sort
//   return listOfScores[0]
//   // this returns the high score, but now we have to find the player who got this score
//   find person who got the score


}