import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:07 PM
 */
public class GetGreetingTest {
    private void testGetGreeting(String input, String expected) {
        // given
        AliceAndBobEngine evaluator = new AliceAndBobEngine();

        // when
        String actual = evaluator.getGreeting(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetGreetingAlice() {
        String name = "Alice";
        String expected = "Hello, " + name + "!";
        testGetGreeting(name, expected);
    }

    @Test
    public void testGetGreetingBob() {
        String name = "Bob";
        String expected = "Hello, " + name + "!";
        testGetGreeting(name, expected);
    }

    @Test
    public void testGetGreetingStranger() {
        String[] strangerNames = "Leon Dolio Kris Nobles Desa Lossie Nancy".split(" ");
        for(String strangerName : strangerNames) {
            String expected = "Begone, " + strangerName + "! You're a stranger!";
            testGetGreeting(strangerName, expected);
        }
    }
}
