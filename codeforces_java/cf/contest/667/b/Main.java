import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && LongStream.generate(sc::nextLong).limit(n).toArray() instanceof long[] a
            ? 2 * Arrays.stream(a).max().getAsLong() - Arrays.stream(a).sum() + 1 : "");
    }
}
