package card_game;
import card_game.*;

import java.util.*;

public class Game {

  private ArrayList<Player> players = new ArrayList<Player>();
  private static ArrayList<Card> deck = new ArrayList<Card>();
  private WinChecker winChecker = new WinChecker();

  public void buildDeck(){
    for (int i=1; i<14; i++) {
      for(Suit suit : Suit.values()){
        deck.add(new Card(i, suit));
      }
    }
    shuffleDeck();
  }

  public Game(){
    buildDeck();
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public int playerCount(){
    return players.size();
  }

  public void deal(){
    for (Player player : this.players){
      player.setHand(deck.get(0), deck.get(1));
      deck.remove(0);
      deck.remove(0);
    } 
  }

  // although code compiles, it doesn't seem to be affecting the result, I think because "bust" is a new variable, rather than changing the value of sumHand itself (but this seems to be th e only way to do it here?)
  // public void twentyOne() {
  //   int bust = 0;
  //   for (Player player : this.players){
  //     if(player.sumHand() > 21) {
  //       bust = player.sumHand();
  //     }
  //   }
  // }




}