import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(i > k ? i + 1 : i % 2 == 0 ? 1 + i / 2 : k + 1 - i / 2)).collect(Collectors.joining(" "))
            : "");
    }
}
