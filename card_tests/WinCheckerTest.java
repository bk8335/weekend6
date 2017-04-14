import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WinCheckerTest {

  WinChecker winChecker;

  @Before
  public void before(){
    winChecker = new WinChecker();
  }

  @Test
  public void checkWinnerSaysABC() {
    assertEquals("abc", winChecker.winner() );
  }

}