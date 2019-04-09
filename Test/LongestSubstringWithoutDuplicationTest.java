import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutDuplicationTest {

    @Test
    public void canary() {
        Assert.assertTrue(true);
    }

    @Test
    public void Test1() {
        String input = "hiiamthere";
        String output = "iamth";
        Assert.assertEquals(LongestSubstringWithoutDuplication.longestSubstringWithoutDupication(input), output);
    }

    @Test
    public void Test2() {
        String input = "jagadish";
        String output = "gadi";
        Assert.assertEquals(LongestSubstringWithoutDuplication.longestSubstringWithoutDupication(input), output);
    }

    @Test
    public void Test3() {
        String input = "iamhere";
        String output = "iamh";
        Assert.assertEquals(LongestSubstringWithoutDuplication.longestSubstringWithoutDupication(input), output);
    }

    @Test
    public void Test4() {
        String input = "jirjiHanuman";
        String output = "rjiHan";
        Assert.assertEquals(LongestSubstringWithoutDuplication.longestSubstringWithoutDupication(input), output);
    }

    @Test
    public void Test5() {
        String input = "venkatSubramaninan";
        String output = "venkatSu";
        Assert.assertEquals(LongestSubstringWithoutDuplication.longestSubstringWithoutDupication(input), output);
    }

    @Test
    public void Test6() {
        String input = "Paulocoheo";
        String output = "Paul";
        Assert.assertEquals(LongestSubstringWithoutDuplication.longestSubstringWithoutDupication(input), output);
    }

}
