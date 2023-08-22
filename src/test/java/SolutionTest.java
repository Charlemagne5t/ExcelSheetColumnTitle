import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void convertToTitleTest1(){
        int columnNumber = 1;
        String expected = "A";
        String actual = new Solution().convertToTitle(columnNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToTitleTest2(){
        int columnNumber = 28;
        String expected = "AB";
        String actual = new Solution().convertToTitle(columnNumber);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertToTitleTest3(){
        int columnNumber = 701;
        String expected = "ZY";
        String actual = new Solution().convertToTitle(columnNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToTitleTest4(){
        int columnNumber = 2147483647;
        String expected = "FXSHRXW";
        String actual = new Solution().convertToTitle(columnNumber);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertToTitleTest6(){
        int columnNumber = 52;
        String expected = "AZ";
        String actual = new Solution().convertToTitle(columnNumber);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertToTitleTest7(){
        int columnNumber = 51;
        String expected = "AY";
        String actual = new Solution().convertToTitle(columnNumber);

        Assert.assertEquals(expected, actual);
    }
}
