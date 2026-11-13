import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            && IntStream.rangeClosed(1, 1000).filter(i -> n % i == 0 && i * i <= n).boxed().max(Integer::compare).get() instanceof Integer a
            ? a + " " + n / a : "");
    }
}
