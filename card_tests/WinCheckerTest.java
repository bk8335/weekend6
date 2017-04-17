import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WinCheckerTest {

  WinChecker winChecker;
  Player player1;
  Player player2;
  Player player3;
  Card card1;
  Card card2;
  Card card3;
  Card card4;
  Card card5;
  Card card6;
  ArrayList<Player> players;
  Game game;

  @Before
  public void before(){
    winChecker = new WinChecker();
    player1 = new Player("Ben");
    player2 = new Player("dave");
    player3 = new Player("Max");
    card1 = new Card(10, Suit.Spades);
    card2 = new Card(12, Suit.Spades);
    card3 = new Card(5, Suit.Spades);
    card4 = new Card(3, Suit.Spades);
    card5 = new Card(10, Suit.Clubs);
    card6 = new Card(10, Suit.Diamonds);
    player1.setHand(card1, card2);
    player2.setHand(card3, card4);
    player3.setHand(card5, card6);
    players = new ArrayList<Player>();
    game = new Game();
    game.addPlayer(player1);
    game.addPlayer(player2);
    game.addPlayer(player3);
  }

  @Test
  public void checkWinner() {
    assertEquals("dave", winChecker.twoPlayerWinner(player1, player2));
  }

  // @Test
  // public void checkMultiPlayerWinner() {
  //   assertEquals(20, winChecker.multiplayerWinner(players) );
  // }

}