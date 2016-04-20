import org.junit.*;
import static org.junit.Assert.*;

public class FindAndReplaceTest {

  @Test
public void finder_replaceOneWordWithAnother_word() {
  FindAndReplace testGame= new FindAndReplace();
  String expected = "this is my fish" ;
  assertEquals(expected, testGame.finder("this is my word", "word", "fish"));
  }
  @Test
public void finder_replaceOneWordWithinAnother_word() {
  FindAndReplace testGame= new FindAndReplace();
  String expected = "this is my doghedral" ;
  assertEquals(expected, testGame.finder("this is my cathedral", "cat", "dog"));
  }
}
