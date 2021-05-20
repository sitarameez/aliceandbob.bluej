import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:06 PM
 * Used to test `AliceAndBobEngine.isAlice`
 */
public class IsAliceTest {
    private void testIsAlice(String input, Boolean expected){
        // given
        AliceAndBobEngine evaluator = new AliceAndBobEngine();

        // when
        Boolean actual = evaluator.isAlice(input);


        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsAliceTrue() {
        testIsAlice("Alice", true);
    }

    @Test
    public void testIsAliceFalse() {
        for(String word : "The Quick Brown Fox Jumps Over The Lazy Dog".split(" ")) {
            testIsAlice(word, false);
        }
    }

}
