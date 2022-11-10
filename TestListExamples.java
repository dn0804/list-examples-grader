import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class TestListExamples implements StringChecker {
@Test
 public void testFilter() {
  List<String> list = new ArrayList<String>(Arrays.asList("aaa", "eee", "mmm", "lll"));
  StringChecker sc = new Checker();
  assertArrayEquals(new String[] {"aaa", "eee", "mmm", "lll"}, ListExamples.filter(list, sc).toArray());
 }

@Test
public void testMerge() {
  List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "coconut", "mango"));
  List<String> list2 = new ArrayList<String>(Arrays.asList("durian", "dragonfruit"));
  assertArrayEquals(new String[] {"apple", "coconut", "dragonfruit", "durian", "mango"}, ListExamples.merge(list1, list2).toArray());
}

}
