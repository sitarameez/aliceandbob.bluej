import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:07 PM
 * Used to test `AliceAndBobEngine.isAliceOrBob`
 */
public class IsAliceOrBobTest {
    private void testIsAliceOrBob(String input, Boolean expected) {
        // given
        AliceAndBobEngine evaluator = new AliceAndBobEngine();

        // when
        Boolean actual = evaluator.isAliceOrBob(input);


        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testIsAliceOrBobTrue() {
        testIsAliceOrBob("Bob", true);
        testIsAliceOrBob("Alice", true);
    }

    @Test
    public void testIsAliceOrBobFalse() {
        for (String word : "The Quick Brown Fox Jumps Over The Lazy Dog".split(" ")) {
            testIsAliceOrBob(word, false);
        }
    }

}
