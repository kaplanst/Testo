import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.CosineDistance;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("Sergey".equals(StringUtils.capitalize("sergeh")));

    }
}
