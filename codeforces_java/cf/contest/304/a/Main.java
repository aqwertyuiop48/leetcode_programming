import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            ? IntStream.rangeClosed(1, n).mapToLong(a -> IntStream.rangeClosed(a, n).filter(b -> Integer.valueOf((int) Math.round(Math.sqrt(a * a + b * b))) instanceof Integer c && c <= n && c * c == a * a + b * b).count()).sum() : "");
    }
}
