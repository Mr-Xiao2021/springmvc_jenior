import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestHello
 * @Description TODO
 * @Author Mr_X
 * @Date 2022/8/4 9:37
 * @Version 1.0
 */
public class TestHello {
    public static void main(String[] args) {
        System.out.println("hello springmvc");
        System.out.println("gitee springmvc");
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.forEach(System.out::println);
    }
}
