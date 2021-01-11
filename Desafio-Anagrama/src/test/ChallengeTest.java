package test;

import com.company.Challenge;
import org.junit.Assert;
import org.junit.Test;

public class ChallengeTest {
    @Test
    public void testChallenge() {

        Assert.assertTrue(Challenge.nestedAnagrams("bored cat", "act robed"));
        Assert.assertTrue(Challenge.nestedAnagrams("parrot flea lion hornet", "leaf loin raptor throne"));
        Assert.assertFalse(Challenge.nestedAnagrams("parrot flea lion hornet", "leaf loin raptoo throne"));
    }
}
