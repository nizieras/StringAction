import StringClassPackege.MyStringClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UsersServiceTest {

    @Test
    public void StringLen_StringHelloWorld_Return10()
    {
        var msc = new MyStringClass();
        int res = MyStringClass.StringLen("Hello World");
      Assert.assertEquals(res, 11);
    }

}
