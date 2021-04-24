import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

public class FirstTEst {

    @Test
    public static void test() {
        System.out.println("Sergey".equals(StringUtils.capitalize("sergei")));
    }
}