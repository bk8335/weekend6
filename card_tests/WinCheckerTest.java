import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WinCheckerTest {

  WinChecker winChecker;
  Player player1;
  Player player2;
  Card card1;
  Card card2;
  Card card3;
  Card card4;

  @Before
  public void before(){
    winChecker = new WinChecker();
    player1 = new Player("Ben");
    player2 = new Player("dave");
    card1 = new Card(10, Suit.Spades);
    card2 = new Card(9, Suit.Spades);
    card3 = new Card(5, Suit.Spades);
    card4 = new Card(3, Suit.Spades);
    player2.setHand(card1, card2);
    player1.setHand(card3, card4);

  }

  @Test
  public void checkWinner() {
    assertEquals("player2", winChecker.winner(player1, player2));
  }

}