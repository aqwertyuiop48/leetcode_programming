import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer k
            ? IntStream.range(0, 1 << k).mapToObj(i -> IntStream.range(0, 1 << k).mapToObj(j -> Integer.bitCount(i & j) % 2 == 0 ? "+" : "*").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
