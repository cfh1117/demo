import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void Testdemo(){
        System.out.println("hello");
        Assert.assertEquals(1+1,3,"错误");
//        System.out.println(1/0);

    }
}
