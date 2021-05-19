import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:07 PM
 */
public class IsBobTest {
    private void testIsBob(String input, Boolean expected) {
        // given
        AliceAndBobEngine evaluator = new AliceAndBobEngine();

        // when
        Boolean actual = evaluator.isBob(input);


        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsBobTrue() {
        testIsBob("Bob", true);
    }

    @Test
    public void testIsBobFalse() {
        for (String word : "The Quick Brown Fox Jumps Over The Lazy Dog".split(" ")) {
            testIsBob(word, false);
        }
    }
}
